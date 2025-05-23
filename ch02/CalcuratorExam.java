package ch02;

import java.util.Scanner;

public class CalcuratorExam {

	public static void main(String[] args) {
		// 계산 프로그램 만들기
		// 간단한 계산기 프로그램 만들기
		// 입력받기 : 숫자 > 연산자 > 숫자
		// 연산자별로 메서드에 숫자를 넣기. (입력받는 순서에 맞춰서 조금 귀찮지만 메서드에서 잘 해결하기)
		// 결과값 main메서드에서 출력해주기(return을 받아서)
		// 완료 반복재생 가능하게 while문 사용하기 (다시 하시겠습니까? or 이어서 계산하시겠습니까)
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0; // 일단 변수 4개를 만들자
		boolean run = true, run2 = true; // while 불리언
		String y1 = "연산기호"; // 정답 표시용
		Scanner scint = new Scanner(System.in); // 스캐너

		while (run) {
			if (x1 == 0) {
				System.out.print("**정수계산기**\n숫자를 입력해주세요(int 범위 내에서)\n>>");
				x1 = scint.nextInt();
			}
			System.out.print("부호를 선택해주세요 +,-,*,/>>>");
			x2 = scint.nextInt();
			System.out.print("숫자를 입력해주세요.(int범위내에서)>>>");
			x3 = scint.nextInt();
			run2 = true;
			switch (x2) {
			case 1:
				x4 = plus(x1, x3);
				y1 = "+";
				break;
			case 2:
				x4 = minus(x1, x3);
				y1 = "-";
				break;
			case 3:
				x4 = times(x1, x3);
				y1 = "x";
				break;
			case 4:
				x4 = divide(x1, x3);
				y1 = "÷";
				break;
			// default 생략

			}// switch(x2) end

			System.out.println("계산결과 :" + x1 + y1 + x3 + "=" + x4);

			while (run2) {
				if (x4 != 0) {
					System.out.print("1.종료하기\n2.다시하기\n3.이어서 계산하기\n>>>");

				} else {
					System.out.println("1.종료하기\n2.다시하기\n>>>");

				}
				x5 = scint.nextInt();

				switch (x5) {
				case 2:
					x1 = 0;
					x2 = 0;
					x3 = 0;

					run2 = false;
					break;
				case 3:
					x1 = x4;
					x2 = 0;
					x3 = 0;
					run2 = false;
					break;
				case 1:
					run = false;
					run2 = false;
					break;
				default:
					System.out.println("숫자를 잘 못 선택하셨습니다");

				} // 스위치문 종료
			} // 와이드 런2문 종료
		} // 와이드문 런 종료

	} // main메서드 종료

	static int divide(int x1, int x3) {
		// TODO Auto-generated method stub
		int x4 = 0;
		x4 = x1 / x3;

		return x4;
	}

	static int times(int x1, int x3) {
		// TODO Auto-generated method stub
		int x4 = 0;
		x4 = x1 * x3;

		return x4;
	}

	static int minus(int x1, int x3) {
		// TODO Auto-generated method stub
		int x4 = 0;
		x4 = x1 - x3;

		return x4;
	} // minus 메서드

	static int plus(int x1, int x3) {
		// TODO Auto-generated method stub

		int x4 = 0;
		x4 = x1 + x3;
		return x4;

	}// plus 메서드

}// 클래스 종료
