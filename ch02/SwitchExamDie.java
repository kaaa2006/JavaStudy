
package ch02;

public class SwitchExamDie {

	public static void main(String[] args) {
		// switch 와 랜덤을 이용해서 주사위 만들기
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;
		default:
			System.out.println("프로그램 오류 주사위가 고장났습니다");
			break;

		}// 스위치문 종료

	}// main 메서드 종료

}// class 종료
