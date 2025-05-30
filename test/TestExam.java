package test;

import java.util.Scanner;

import test.DTO.MemberDTO;
import test.DTO.TotalDTO;
import test.service.MemberService;
import test.service.TestService;

public class TestExam {
	 
	static Scanner inputStr = new Scanner(System.in);
	 static Scanner inputInt = new Scanner(System.in);
	
	 public static MemberService memberService = new MemberService(); //회원수배열 
	 public static TestService[] testService = new TestService[10];// 점수배열
	 public static MemberDTO[] memberDTOs = new MemberDTO[10];
	 public static TotalDTO totalDTO ; // null  값
		private static MemberDTO loginState;// 세션기능
	 public static void main(String[] args) {
		//  성적처리 프로그램 만들기!ㅁ
		 boolean run = true;
		 System.out.println("성적처리 프로그램을 진입하셨습니다.");
		 while(run) {
			 System.out.println("1.점수관리");
			 System.out.println("2.회원관리");
			 System.out.println("3.프로그램 종료");
			 System.out.print(">>>");
			 String select = inputStr.next();
			 switch(select) {
			 case"1":
				 System.out.println("점수관리 메뉴로 진입");
				 TestService.menu(inputInt,inputStr,totalDTO );
				 break;
			 case"2":
				 System.out.println("점수관리 메뉴로 진입");
				 MemberService.menu(inputInt, inputStr, memberDTOs, loginState);
				 break;
			 }// 스위치문 
			 
		 }//와이드문
		

	}//메인메서드

}//class
