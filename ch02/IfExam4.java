package ch02;

import java.util.Scanner;

public class IfExam4 {

	public static void main(String[] args) {
		// 주민번호 남녀 구분
		System.out.println("주민번호를 입력하세요(-생략)");
		Scanner in = new Scanner(System.in);

		String ssn = in.next();

		char ssn2 = ssn.charAt(6);
		int num = Character.getNumericValue(ssn2);

		if (num % 2 == 0) {
			System.out.println("여자");
		} else if (num % 2 == 1) {
			System.out.println("남자");
		} else {
			System.out.println("다시 작성해주세요.");

		} // 성별 구분 if문 종료
		int year = Integer.parseInt(ssn.substring(0, 2));
		if (num == 1 || num == 2 || num == 5 || num == 6) {
			System.out.println("나이는" + (2023 - (1900 + year) + 1) + "입니다");
		} else if (num == 3 || num == 4 || num == 7 || num == 8) {
			System.out.println("나이는" + (2023 - (2000 + year) + 1) + "입니다.");
		}

	}

}