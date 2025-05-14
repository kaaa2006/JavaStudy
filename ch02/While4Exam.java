package ch02;

import java.util.Scanner;

public class While4Exam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램
		// c - 시동을 건다
		// r - 계기판 정보 출력
		// u - 주행
		// d -시동을 끈다

		Scanner input = new Scanner(System.in);
		boolean run = true; // 시동을 켠다
		int speed = 0; // 차량 속도
		final int MAXSPEED = 300; // 최고 속도 상수(변경안됨)
		final int MINSPEED = 0; // 최저 속도 상수(변경안됨)

		// MAXSPEED = 400 ;

		// The final local variable MAXSPEED cannot be assigned. it must be blank and
		// not using a compound assignment

		System.out.println("bmw가 입고 되었습니다.");

		System.out.println("시동을 켭니다");

		System.out.println("현재속도 :" + speed + "km/h");

		while (run) {
			System.out.println("=============================");

			System.out.println("0. 시동종료");
			System.out.println("1. 엑셀");
			System.out.println("2. 브레이크");
			System.out.println("3. 멀티미디어");
			System.out.println("4. 주유하기");
			System.out.println("==================");
			System.out.print("(0~4)숫자입력>>>");

			int select = input.nextInt();

			switch (select) {
			case 0:
				System.out.println("시동을 종료합니다.");
				run = false; // while문 종료
				break;

			case 1:
				System.out.println("가속을 진행합니다.");
				speed += 30;
				if (speed >= MAXSPEED) {// 현재속도가 최고속도보다 크거나 같으면
					speed = MAXSPEED;

				} // case 1 if문 종료 //300이상 출력 안됨
				System.out.println("현재속도:" + speed + "km/h");
				break;

			case 2:
				System.out.println("가속을 진행합니다");
				speed -= 10;
				if (speed <= MINSPEED) {
					speed = MAXSPEED;

				} // case2 if문 종료
				System.out.println("현재속도" + speed + "km/h");
				break;

			case 3:
				System.out.println("멀티미디어를 실행합니다.");
				break;

			case 4:
				System.out.println("주유를 시작합니다.");
				break;
				default :
					System.out.println("0~4 까지만 실행해주세요");
			}// switch문 종료
		} // while문 종료
	System.out.println("bmw 자동차가 사라집니다.");
	}// main 메서드 종료

}// class 종료
