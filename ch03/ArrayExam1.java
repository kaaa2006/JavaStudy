package ch03;

import java.util.Scanner;

public class ArrayExam1 {

	public static void main(String[] args) {
		// 키보드로 입력받은 값을 배열에 저장후 crud 테스트
		// c 성적을 입력
		// r 성적 보기 (전체,한개)
		// u 성적 수정하기
		// d 성정 삭제하기
		// 개선사항-> 성적 입력시 NULL 값을 넣어보기

		Scanner inputInt = new Scanner(System.in);

		System.out.println("앰비씨 성적처리 프로그램");
		System.out.println("학생수를 입력해주세요.");
		System.out.print(">>>");
		int count = inputInt.nextInt();
		System.out.println(count + "명의 학생 성적을 입력하겠습니다.");

		String[] scores = new String[count]; // 점수배
		String[] names = new String[count]; // 이름배열
		int[] kors = new int[count];// 국어점수배열
		int[] mats = new int[count];// 수학점수배열
		int[] engs = new int[count];// 영어점수배열
		// 국어 수학 영어 점수의 배열을 학생명 수 만큼 만듦
		boolean run = true;

		while (run) {
			System.out.println("성적처리");
			System.out.println("1. 성적입력");
			System.out.println("2. 전체 성적보기");
			System.out.println("3. 개인성적보기");
			System.out.println("4. 성적 수정");
			System.out.println("5. 성적 삭제");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>>");

			int select = inputInt.nextInt();

			switch (select) {

			case 1:
				System.out.println("성적입력 화면으로 이동하였습니다.");
				// 메서드 생성시 입력 값과 출력 값을 먼저 생각을 해야함
				scoreAdd(names, kors, mats, engs);
				break;
			case 2:
				System.out.println("전체 성적 보기 화면입니다");
				scoreChe(names, kors, mats, engs);
				break;
			case 3:
				System.out.println("개인 성적 보기 화면입니다");
				scoreps(names, kors, mats, engs);
				break;
			case 4:
				System.out.println("개인 성적 수정 화면입니다");
				scoreMod(names, kors, mats, engs);
				break;
			case 5:
				System.out.println("성적 삭제 화면입니다");

				break;
			case 9:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("1~9까지 입력");
				break;
			}// 성적처리 switch문 종료
		} // 성적처리 while문 종료
	}// main 메서드 종료

	private static void scoreps(String[] names, int[] kors, int[] mats, int[] engs) {
		// 개인성적표 메서드
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		System.out.println("개인 성적표 보기");
		System.out.println("이름을 입력 해주세요.");
		System.out.print(">>>");
		String name = inputStr.nextLine();
		for (int i = 0; i< names.length; i++) {
			if(names[i].equals(name)) {
				System.out.println(names[i] + "학생점수");
				System.out.println("국어:" + kors[i]);
				System.out.println("수학:" + mats[i]);
				System.out.println("영어:" + engs[i]);
				break;
			}else {
				System.out.println("입력받은 학생의 이름이 아닙니다.");
			}
			
		}
		
		
		
		
	}

	static void scoreChe(String[] names, int[] kors, int[] mats, int[] engs) {
		// main에서 만든 배열 5개를 가져와 전체 성적을 본다
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("전체 성적보기");
		System.out.println("============");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			System.out.println("국어" + kors[i] + "점");
			System.out.println("수학" + mats[i] + "점");
			System.out.println("영어" + engs[i] + "점");
			System.out.println("==================");
			break;
		}

	}

	static void scoreMod(String[] names, int[] kors, int[] mats, int[] engs) {
		// main에서 만든 배열4개를 가져와 성적 수정을 한다.
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("수정할 학생의 이름을 입력하세요.");
		System.out.print(">>>");
		String name = inputStr.nextLine();

		for (int i = 0; i < names.length; i++) {

			if (names[i].equals(name)) {
				// 키보드로 입력한 값이 이름배열에 같은 값이 있는지 파악
				System.out.println(names[i] + "학생점수");
				System.out.println("국어:" + kors[i]);
				System.out.println("수학:" + mats[i]);
				System.out.println("영어:" + engs[i]);
				System.out.println("===================");
				System.out.println("수정할 점수를 입력하세요.");
				System.out.print("국어 수정 점수:");
				kors[i] = inputInt.nextInt();
				System.out.print("수학 수정 점수:");
				mats[i] = inputInt.nextInt();
				System.out.print("영어 수정 점수:");
				engs[i] = inputInt.nextInt();

				System.out.println("수정완료");

				System.out.println("국어:" + kors[i]);
				System.out.println("수학:" + mats[i]);
				System.out.println("영어:" + engs[i]);
				System.out.println("===================");
				break;
			} else {
				System.out.println("없는 학생 이름입니다 ");
				break;
			}

		}

	}// 성적수정 메서드 종료

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {
		// main에서 배열 4개를 키보드로 값을 넣는다.
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하세요.");
			System.out.print(">>>");
			names[i] = inputStr.next();

			System.out.print("국어점수 :");
			kors[i] = inputInt.nextInt();

			System.out.print("수학점수:");
			mats[i] = inputInt.nextInt();

			System.out.print("영어점수 :");
			engs[i] = inputInt.nextInt();
		} // 반복 성적 입력 종료
		System.out.println("성적입력이 완료 되었습니다.");
	}// 성적입력 메서드 종료

}// class 종료
