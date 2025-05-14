package ch02;

public class WhileOutterExam {

	public static void main(String[] args) {
		// break문에 라벨을 붙이면 반복코드 종료시점을 정할 수 있다.
		Outter: for (char upper = 'A'; upper <= 'z'; upper++) {// A~Z까지 반복용 코드
			 for (char lower = 'a'; lower <= 'z'; lower++) {// a~z까지 반복용 코드

				System.out.println(upper + "-" + lower);
				if (lower == 'c') {
					break Outter;
				} // if문 종료
			} // for 소준자 반복문 종료
		} // for 대문자 반복문 종료
	}// main 메서드 종료

}// class 종료
