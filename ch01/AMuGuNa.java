package ch01;

import java.util.Scanner;

public class AMuGuNa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10 ;
		int y = x % 2 ;
		String resultx = (y==1)? "홀수":"짝수" ;
		System.out.println("10의 홀짝 여부:" + resultx );
		
		
		
		
		int x1 = 12 ;
		int y2 = x % 2 ;
		String resulty2 = (y2==0)? "4의 배수" :"오답" ;
		System.out.println("16는 4의 배수인가:" + resulty2);
		
		
		
		
		
		
		
		int x2 = 12 ;
		int y3 = x % 2 ;
		String resulty3 = (y3==0)? "2의 배수이다":"아니다" ;
		System.out.println("2의 배수 판단결과 :" +resulty3 );
		System.out.println("==============================================================================================================");
		
		String loginid ="kaaa1877" ;
		String loginpw ="siki8400" ;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("id를 입력하세요.");
		String id = input.nextLine();
		System.out.println("입력하신 id는" + id + "입니다.");
		
		System.out.println("pw를 입력하세요.");
		String pw = input.nextLine();
		System.out.println("===검증중===");
		
		if((loginid.equals(id)) & (loginpw.equals(pw))) {
			System.out.println("id pw가 일치합니다.");
			System.out.println("로그인 성공");
		}else{
		System.out.println("id나 pw가 틀립니다.");
		System.out.println("로그인 실패");
			
		
		
		}
			
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
