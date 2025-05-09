package ch01;

public class ASAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 15 ;
		int num2 = 15 ; 
		boolean result1 = (num1 == num2) ;
		boolean result2 = (num1 != num2) ;
		boolean result3 = (num1 <= num2) ;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		char char1 ='A' ;
		char char2 ='B' ;
		boolean result4 = (char1 > char2) ;
		
		System.out.println("result4 :" + result4);
		
		int v1 = 1 ;
		double v2 = 1.0 ;
		System.out.println(v1 == v2);
		
		double v3 = 0.2 ;
		float v4 = 0.2F ;
		System.out.println(v3 == v4);
		System.out.println((float)v3 == v4);
		//System.out.println(v3 == (double)v4);
		System.out.println((int)(v3*100)==(int)(v4*100));
		
		
		
		
		
		
		
		
		
		
		

	}

}
