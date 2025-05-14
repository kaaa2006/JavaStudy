package ch02;

import java.util.Scanner;

public class SwitchIfExam1 {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		System.out.println("==========");
		System.out.println("a.학생등록");
		System.out.println("b.선생님관리");
		System.out.println("c.성적관리");
		System.out.println("d.프로그램 종료");
		System.out.print("(a~d)>>>");
		char select = input.next().charAt(0);
		
		switch(select) {
		case 'A':
		case 'a':
			System.out.println("학생관리 메뉴로 이동하였습니다. ");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생보기");
			System.out.println("3. 학생수정");
			System.out.println("4. 학생삭제");
			System.out.print("(1~4)>>");
			int subselect = input.nextInt();
		
		}
		
		
		
		
				
				
		
	}

}
