package ch04;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		// Member 클래스를 호출하여 처리해보자
		Scanner input = new Scanner(System.in);
		Member[] members = null;

		System.out.println("가입할 회원수를 입력하세요");
		System.out.print(">>>");
		int count = input.nextInt(); // 키보드로 입력 받을것
		members = new Member[count]; // 키보드로 입력한 숫자만큼 배열 생성

		System.out.println("회원가입 프로그램을 시작합니다");
		boolean run = true;
		while (run) {
			System.out.println("1.회원가입");
			System.out.println("2. 회원전체보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원수정");
			System.out.println("5. 회원탈퇴");
			System.out.println("1~5까지만 입력 받을수 있습니다");
			System.out.print(">>>");
			int select = input.nextInt();
			switch(select) {
			case 1:
				
				Member member1 = new Member(); //객체 생성
				
				for(int i=0; i<members.length; i++) {
				
					member1 = member1.memberAdd(input);
					members[i] = member1;
				}
				
			case 2:
				Member member2 = new Member(); //객체 생성
				member2.memberAllList(members);
			case 3:
				Member member3 = new Member(); //객체 생성
				member3.memberLogin(input,members);
			case 4:
				Member member4 = new Member(); //객체 생성
			
			case 5:
				Member member5 = new Member(); //객체 생성
			
			}
		} // while

	}// main

}// class
