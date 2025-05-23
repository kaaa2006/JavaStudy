package ch02;

public class IfExam2 {

	public static void main(String[] args) {
		// 1~6 숫자 주사위
		int num = (int) (Math.random() * 6 + 1);

		if (num == 1) {
			System.out.println("1번이 나왔습니다");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다");
		} else if (num == 6) {
			System.out.println("6번이 나왔습니다.");
		} else {
			System.out.println("프로그램 오류로 점검해주세요");
		}

	}

}