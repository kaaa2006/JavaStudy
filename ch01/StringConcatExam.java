package ch01;

import java.util.Scanner;

public class StringConcatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strval1 = "kim" + 12.9 ;
		System.out.println(strval1);
		
		
		String strval2 = 18.1 + 16.1 + "kim" ;
		System.out.println(strval2);
		
		
		
		String str4 = 3 + 3.0 + "kkk" ;
		System.out.println(str4);
		
		String str5 = "GDF" + 7.4 ;
		String str6 = str5 + "특징" ;
		System.out.println(str5);
		System.out.println(str6);
		
		
		
		
		
		
		
		
						
		String loginid = "kms"; //id객체생성
		String loginpw = "1234" ; //pw객체생성
		
		Scanner input = new Scanner (System.in);
		System.out.print("로그인 id입력");
		String id = input.nextLine();
		System.out.println("id는" + id + "입니다.");
		
		System.out.print("pw입력");
		String pw = input.nextLine();
		System.out.println("==검증중==");
		
		if (loginid.equals(id)&(loginpw.equals(pw))) {
		System.out.println("일치");
		System.out.println("로그인 성공");
		}else{
		System.out.println("id,pw 가 틀립니다");
		System.out.println("login 실패");
		
		
		
		
		}
			
	}

}
