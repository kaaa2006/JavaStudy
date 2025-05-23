package ch03;

import java.util.Scanner;

public class ArrayExam5 {

	public static void main(String[] args) {
		// 자판기 프로그램

		Scanner inputInt = new Scanner(System.in);
		Scanner inputUpd = new Scanner(System.in);
		String mid = "m"; // 관리자 로그인 아이디
		String mpw = "1234"; // 관리자 로그인 비밀번호

		String[] dr = { "콜라", "사이다", "커피" }; // 음료 배열
		int[] pr = { 2000, 1700, 1500 }; // 가격 배열
		int[] stock = { 5, 5, 5 }; // 재고 배열

		boolean run = true;
		boolean session = false; // 로그인 저장용
		boolean session2 = true;
		while (run) {
			System.out.println("==자판기 프로그램==");
			System.out.println("1. 사용자 모드");
			System.out.println("2. 관리자 모드");
			System.out.println("9. 종료");
			System.out.print(">>>");
			int cho = inputInt.nextInt();

			switch (cho) {

			case 1:
				System.out.println("사용자 모드로 이동합니다.");
				session2 = guest(dr,pr,stock,session2);
			case 2:
				System.out.println("관리자 로그인모드 들어오셨습니다.");
				session = login(mid, mpw, session);
				if (session == true) {
					System.out.println(mid + "님 관리자 모드에 오실걸 환영합니다");
					System.out.println("1. 메뉴 변경");
					System.out.println("2. 가격 변경");
					System.out.println("3. 재고 관리");
					System.out.println("0번 처음 화면으로 이동");
					System.out.print(">>>");
					int upd = inputUpd.nextInt();
					switch (upd) {
					
					case 1:
						System.out.println("메뉴변경 모드에 들어오셨습니다");
						for (int i = 0; i < dr.length; i++) {
							System.out.print((i + 1) + "번 음료를 변경" + dr[i] + ":");
							String newdr = inputUpd.next();
							System.out.println("" + dr[i] + "음료가" + newdr + "으로 변경되었습니다.");
						}
						
						System.out.println("메뉴가 변경되었습니다.");
						break;
					case 2:
						System.out.println("가격변경 모드에 들어오셨습니다");
						for (int i = 0; i < pr.length; i++) {
							System.out.print((i + 1) + "번 가격변경" + pr[i] + ":");
							String newpr = inputUpd.next();
							System.out.println(""  + pr[i] + "가격이" + newpr +"으로 변경되었습니다" );
						}

						break;
					case 3:
						System.out.println("재고관리 모드에 들어오셨습니다");
						for(int i=0; i<stock.length; i ++) {
							System.out.println((i + 1) + "재고 관리"+ stock[i] + "i");
							String newstock = inputUpd.next();
							System.out.println(" "+ stock [i] + "개의 재고가" + newstock +"개로 바뀌었습니다");
						}
						
						break;
					case 0:
						System.out.println("처음 화면으로 이동하겠습니다");
						run = false;
						break;
						

					}

				}

				break;
			case 9:
				System.out.println("자판기 프로그램을 종료하겠습니다");
				run = false;
				break;

			}// 스위치문

		} // 와이들문 종료

	}// 메인 메서드 종료

	private static boolean guest(String[] dr, int[] pr, int[] stock, boolean session2) {
		// 사용자 모드 메서드
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		boolean select =true;
		for(int i=0; i < dr.length ; i++) {
			System.out.println("====자판기 메뉴====");
			System.out.println("["+dr[i]+"]"+"["+pr[i]+"원]");	//메뉴와 가격을 보여줌
		}
		
			System.out.println("원하는 음료를 써주세요.");
			
						
			for (int i=0 ; i<dr.length; i++) {
				System.out.println((i+1)+ "."+dr[i]+"-가격:"+pr[i]+"원");
				System.out.print("선택(1,2,3)");
				int inputmny = inputInt.nextInt();
				if(inputmny >=  dr.length) {
					
				}
			}
				
			
		
		return session2;
	}// 사용자 모드 메서드 종료

	static boolean login(String mid, String mpw, boolean session) {
		// 관리자가 로그인 할 메서드

		Scanner inputUpd = new Scanner(System.in);
		Scanner inputLoginn = new Scanner(System.in);
		System.out.println("관리자 아이디를 입력하세요");
		System.out.print(">>>");
		String inputmid = inputLoginn.next(); // 아이디 입력
		System.out.println("관리자 비밀번호를 입력하세요");
		System.out.print(">>>");
		String inputmpw = inputLoginn.next(); // 비밀번호 입력

		if (mid.equals(inputmid) && mpw.equals(inputmpw)) {
			System.out.println("로그인에 성공하셨습니다 ");
			session = true;

		} else {
			System.out.println("로그인 실패");
			session = false;
		}

		return session;
	}

}// 클래스 종료
