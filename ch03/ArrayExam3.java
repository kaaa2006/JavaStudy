package ch03;

public class ArrayExam3 {

	public static void main(String[] args) {
		// 총합과 평균 구하는 배열 
		int sum = 0 ;  //총합과 평균을 구하는 배열
		float avg = 0F ; // 평균을 조정허가 위한 변수
		
		int[] scores = {100,88,100,100,90} ; // 5자료 제공
		//총점 공식
		for ( int i = 0 ; i< scores.length; i++) {
			sum += scores[i];
			
		}
		
		avg = sum / (float)scores.length ; // 계산 결과를 float으로 얻기 위함
		
		System.out.println("총점 :" + sum);
		System.out.println("평균"+avg);
		
		
	}

}
