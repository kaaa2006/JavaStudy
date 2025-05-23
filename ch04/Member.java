package ch04;

import java.util.Scanner;

public class Member {

	
	
	// 필드 :객체가 가지고 있어야할 변수
	public int mno; 
	public String id;
	public String pw;
	//생성자 : Exam클래스에 main()에서 new로 호출할 동작
	public Member() {
		//기본생성자: 클래스명과 같은 메서드 
		
	}
	
	//메서드: Member 클래스에서 행해지는 동작 CRUD
	
	public Member memberAdd(Scanner input) {
		Member member = new Member(); //리턴용 객체
		System.out.println("회원가입용 메서드입니다");
		System.out.println("회원번호를 입력하세요");
		System.out.print("숫자 >>>");
		member.mno = input.nextInt();
		
		System.out.println("회원id를 입력하세요");
		System.out.print("숫자 >>>");
		member.id = input.next();
		
		System.out.println("회원pw를 입력하세요");
		System.out.print("숫자 >>>");
		member.pw = input.next();
		
		return member;
	}// Add종료

	public void memberAllList(Member[] members) {
		// TODO Auto-generated method stub
		System.out.println("회원 전체 보기 리스트 메서드입니다");
		for(int i=0 ; i < members.length ; i++) {
			System.out.println("회원번호:" + members[i].mno );
			System.out.println(":회원id:" + members[i].id );
			System.out.println(":회원pw:" + members[i].pw );
			System.out.println("------------------------");
		}
		
	}// List 종료

	public void memberLogin(Scanner input,Member[] members ) {
		System.out.println("로그인 메서드 입니다");
		for(int i=0 ; i< members.length ; i++) {
			System.out.println("로그인 id를 입력해주세요");
			System.out.print(">>>");
			String memberid = input.next();
			System.out.println("로그인 pw를 입력해주세요");
			System.out.print(">>>");
			String memberpw = input.next();
			if(members[i].equals(id)&&members[i].equals(pw)) {
				System.out.println("로그인 성공");
			}
			
		}
	}
	
	public void memberUpdate() {
		System.out.println("회원 수정 메서드입니다");
		
	}
	public void memberDelte() {
		System.out.println("회원탈퇴 메서드입니다");
	}
}
