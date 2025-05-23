
package ch02;

import java.util.Scanner;

public class SwitchFirstExam {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);

		System.out.println("나이를 입력하세요:");
		int age = input.nextInt();

		System.out.println("원하는 음료 번호를 선택하세요:");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 커피");

		int choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("콜라를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("사이다를 선택하셨습니다.");
			break;
		case 3:
			// 나이 제한 조건 체크
			if (age >= 19) {
				System.out.println("커피를 선택하셨습니다.");
			} else {
				System.out.println("19세 미만은 커피를 구매할 수 없습니다.");
			}
			break;
		default:
			System.out.println("잘못된 선택입니다.");
		}

	}
}
