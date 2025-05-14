package ch02;

public class WhileContinuExam {

	public static void main(String[] args) {
		for (int i = 1 ; i <= 10 ; i++) { //i가 1~10까지 1씩 증가
			if(i%2 !=0) { //짝수 아님
				continue ;
				
			}//if문 종료
			System.out.println(i);
		}//main 메서드 종료
	}//class 종료

}
