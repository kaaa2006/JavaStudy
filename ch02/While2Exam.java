package ch02;

public class While2Exam {

	public static void main(String[] args) {
		// for문으로 만든 1~100까지의 합을 while문으로 개선해보기
		// 1부터 100까지의 합을 구해본다. 1+2+3+.....

		int sum = 0; // 누적합계를 구하는 변수를 선언
		int i = 1;
		while (1 <= 100) {
			sum = sum + 1;
			i++;
			System.out.println("1~" + (i-1) +"까지의 합 :" +sum);		
			
		} // while문 종료
		
	}// main 메서드 종료

}// class 종료
