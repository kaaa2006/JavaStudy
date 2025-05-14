package ch02;

import java.util.Scanner;

public class SwitchIfExam {

	public static void main(String[] args) {
		// if 사용해서 로그인, 회원가입 만들어보기
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("환영합니다.");
		System.out.println("a. 회원가입,로그인");
		System.out.println("b. ==");
		System.out.print("(a~b)>>>");
		char select = input.next().charAt(0);
		
		switch(select) {
		case 'A' :
		case 'a' :	
			System.out.println("회원가입 화면으로 이동하셨습니다");
			System.out.println("1.회원가입 하기");
			System.out.println("2.로그인 하기");
			System.out.print("(1~2)>>");
			int subselect = input.nextInt();
			switch(subselect) {
			case 1 :
				System.out.println("회원가입 하기");
				
				break;
			case 2 :
				System.out.println("로그인 하기");
			}
			
			
						
		}
			
			
		}
		
		
		
	

	}


