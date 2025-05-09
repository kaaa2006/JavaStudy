package ch01;

public class AppleExam {

	public static void main(String[] args) {
		// 사과 1개를 10조각으로 쪼갤때 소수점 처리말고 10으로 곱해보자 int 활용 
		
		int apple = 1 ;
		int totalPieces = apple * 10 ; //사과 1개 10조각
		int number = 5 ; //사과 1조각
		int temp = totalPieces - number ; //사과 10조각 - 5개
		
		double result = temp / 10.0 ; //위에서 10조각 원위치
		System.out.println("사과 남은 조각 수 :" + result);
		
		
		
		
		
		
	}

}
