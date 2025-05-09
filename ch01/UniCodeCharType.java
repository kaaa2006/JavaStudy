package ch01;

public class UniCodeCharType {

	public static void main(String[] args) {
		char c1 = 75 ; //A문자를 출력하기 위해 char에 대입
		char c2 = 105 ; //10진수 65를 char에 대입하여 유니코드
		char c3 = 109 ; // /u
		
		char c4 = 75 ;
		char c5 = 105 ;
		
		char c6 = 87 ;
		char c7 = 111 ;
		char c8 = 110 ;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		char han1 = '가' ;
		char han2 = 44032 ;
		char han3 = '\uac00' ;
		
		System.out.println(han1);
		System.out.println(han2);
		System.out.println(han3);
		
		int unicode1 = '김' ;
		int unicode2 = '민' ;
		int unicode3 = '석' ;
		 
		System.out.println(unicode1);
		System.out.println(unicode2);
		System.out.println(unicode3);
		
		char k1 = 44608 ;
		char k2 = 48124 ;
		char k3 = 49437 ;
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		
				
	}

}
