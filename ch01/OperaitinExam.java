package ch01;

public class OperaitinExam {

	public static void main(String[] args) {
		// 연산자는 프로그램에서 데이터를 처리하려 결과를 산출함.
		// 연산자는 +,-,*,/,% (4칙 연산자 + 나머지 계산)
		
		
		int od= 15 ;
		int y = od % 2 ;
		String resultod = (y == 1)? "홀수":"짝수" ;
		 System.out.println("15의 짝수 계산:" + resultod );
		
		 
		 
		 
		int x = 12 ;
		int y2 = x % 2 ;
		String resulty2 = (y2==0)? "2의 배수이다":"아니다" ;
		System.out.println("2의 배수 판단결과 :" +resulty2 );
		
		
	}

}
