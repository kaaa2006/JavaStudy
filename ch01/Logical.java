package ch01;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// //논리적인 연산자는 크게 5가지 유형이 있다.
		// & : 논리 곱 -> ~이고 (2가지 변수가 모두 참일경우 참)
		// | : 논리 합 -> ~이거나 (2가지중 한개라도 참이면 참)
		// ! : 논리부정 -> 참과 거짓을 반전 함
		// ^ : 배타적 논리 합 -> 논리합의 마지막인 1 + 1 = 0 으로 결론남
		
		String loginid= "kms" ;
		String loginpw= "1234" ;
		
		Scanner input = new Scanner (System.in) ;
		
		System.out.print("id 입력");
		String id = input.nextLine();
		System.out.println("입력하신 id는 :" + id +"입니다.");
		
		System.out.print("암호를 입력하세요.");
		String pw = input.nextLine();
		System.out.println("==검증중==");
		
		if((loginid.equals(id)) & (loginpw.equals(pw))) {
		
		System.out.println("id pw 일치");
		System.out.println("성공");
		
		}else {
			System.out.println("id나 pw가 틀립니다.");
			System.out.println("로그인 실패");
			
		}
		
		
		
		 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
