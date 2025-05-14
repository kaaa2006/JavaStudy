package ch02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner in = new Scanner(System.in);
		String inputString; //키보드로 입력 받을 값 저장용
		
		do  {
			System.out.print(">>>");
			inputString = in.nextLine();
			System.out.println("전송값 :" + inputString);
			
		}while (!inputString.equals("q")); //do 문 종료
		System.out.println("==============");
		System.out.println("프로그램 종료");
		System.out.println("----------------");
	}//main 메서드 종료

}//class 종료
