package ch02;

import java.util.Scanner;

public class MethodExam {

	public static void main(String[] args) {
		// 성적 처리 프로그램을 메서드로 재구현
		// 메인 메서드에는 주 메뉴를 구현
		// 사용자 지정 메서드는 부메뉴
		Scanner inputint = new Scanner(System.in);

		Scanner inputchar = new Scanner(System.in);
		boolean run = true;
		String id = "kkw";
		String pw = "1234";
		boolean session = false; // 로그인상태 저장용
		String tr = "kim";
		boolean session2 = false;

		while (run) {
			System.out.println("앰비씨");
			System.out.println("1. 로그인");
			System.out.println("2. 교사관리");
			System.out.println("3. 학생관리");
			System.out.println("4. 성적관리");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>>");
			int select = inputint.nextInt();
			switch (select) {
			case 1:
				System.out.println("로그인 메뉴로 이동합니다");
				session = loginOk(id, pw, session);

				if (session == true) {
					System.out.println(id + "님 환영합니다.");
					System.out.println("2~4 메뉴를 사용하실 수 있습니다");

				} else {
					System.out.println("다시 로그인해주세요");

				}
				break;

			case 2:

				System.out.println("교사관리 메뉴로 이동합니다");
				System.out.println("a. 교사등록");
				System.out.println("b. 교사보기");
				System.out.println("c. 교사수정");
				System.out.println("d. 교사삭제");
				System.out.println("f. 교사관리 종료");
				char ad = inputchar.next().charAt(0);
				switch (ad) {
				case 'A':
				case 'a':
					System.out.println("교사등록 메뉴에 오셨습니다");
					session2 = add(tr, session2);
					if (session2 == true) {
						System.out.println(tr + "님 환영합니다");
						System.out.println("b~f까지 사용하실 수 있습니다");
					} else {
						System.out.println("교직원이 아닙니다");
					}
				}
				break;
			case 3:
				System.out.println("학생관리 메뉴로 이동합니다");

				break;
			case 4:
				System.out.println("성적관리 메뉴로 이동합니다");
				System.out.println("");
				break;
			case 9:
				System.out.println("프로그램 종료");

				run = false;
				break;

			}// 스위치문 종료
		} // 와일드문 런 종료

	}// 메인 메서드 종료

	static boolean add(String tr, boolean session2) {
		// 선생님 등록을 결정하는 메서드!!!!!!!!!
		Scanner inputTr = new Scanner(System.in);
		System.out.println("등록할 교직원 이름을 적어주세요.");
		System.out.println(">>>");// 키보드로 이름 입력
		String inputup = inputTr.next();
		if (tr.equals(inputup) && tr.equals(inputup)) {
			System.out.println("등록 되어있는 교직원");
			session2 = true;
		} else {
			System.out.println("등록 되지 않은 교직원 입니다");
			session2 = false;
		}
		return session2;
	}

	static boolean loginOk(String id, String pw, boolean session) {
		// 로그인 여부를 결정하는 메서드
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("로그인 id 입력");
		System.out.println(">>>");
		String inputid = inputLogin.next(); // 키보드로 id 입력

		System.out.println("로그인 pw 입력");
		System.out.println(">>>");
		String inputpw = inputLogin.next(); // pw 입력

		if (id.equals(inputid) && pw.equals(inputpw)) {
			System.out.println("로그인 성공");
			session = true;
		} else {
			System.out.println("로그인 실패");
			session = false;
		} // id pw 일치 판단문 종료

		return session; // 로그인 성광,실패 결과를 리턴에서 메인메뉴 세션으로 올림.
	}// 교직원 등록 판단문 종료

}// 클래스 종료
