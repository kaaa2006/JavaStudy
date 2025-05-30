package ch04.marioKart.service;

import java.util.Scanner;

import ch04.marioKat.DTO.MemberDTO;

public class MemberService {
// 회원관리용 클래스!!!!!!!!!!!!!!! CRUD
	// 부메뉴용
	public MemberDTO menu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {

		System.out.println("회원관리 메뉴에 진입하셨습니다");
		boolean subrun = true;
		while (subrun) {
			System.out.println("|1.회원가입|2.로그인|3.수정|4.삭제|뒤로가기");
			System.out.print(">>>");
			String select = input.next();
			switch (select) {
			case "1":
				System.out.println("계정을 생성합니다");
				create(input, memberDTOs);
				break;
			case "2":
				System.out.println("로그인 하기");
				loginState (input ,memberDTOs,loginState);
				//로그인 메서드 
			case "3":
				System.out.println("회원수정");
				userUpdt (input , memberDTOs,loginState);
				break;
			case "4":
				System.out.println("삭제");
				delete(input, memberDTOs , loginState);
				break;
			case "5":
				System.out.println("뒤로가기");
				subrun = false;
				break;
			case "99":
				System.out.println("관리자페이지 입니다");
			default :
				System.out.println("1~5값만 사용하세요");
			}//switch
		}//while
		return loginState;

		

	}//method

	private void delete(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
	// 삭제용 
	
}

	private void userUpdt(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
	// 회원수정용 
		System.out.print("id를 입력하세요 :");
		String id = input.next();
		System.out.println("pw를 입력하세요 :");
		String pw = input.next();
		
		MemberDTO modifMember = new MemberDTO();
		
		modifMember.id = id;
		modifMember.pw = pw;
		
		if(loginState.id.equals(modifMember.id)&&loginState.pw.equals(modifMember.pw)) { //키보드 id와 로그인 id 비교 
			System.out.println("변경할 pw를 입력하세요");
			loginState.pw = input.next();
			
			
			
		}
}

	public  MemberDTO loginState(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
	// 회원	
		System.out.println("id를 입력하세요 :");
		String id = input.next();
		System.out.println("pw를 입력하세요");
		String pw = input.next();
		MemberDTO loginMember = new MemberDTO();
		loginMember.id = id;
		loginMember.pw = pw;
		for (int i=0;i<memberDTOs.length;i++) {
			if(memberDTOs[i]!=null&&memberDTOs[i].id.equals(id)&&memberDTOs[i].pw.equals(loginMember.pw)) {
				System.out.println("로그인 성공");
				loginState = memberDTOs[i];
			}//if
		}//for
		System.out.println(loginState.nickName +"님 로그인 성공!");
		return null;
}
	
	public void create(Scanner input, MemberDTO[] memberDTOs) {
		// 회원가입 메서드
		MemberDTO memberDTO = new MemberDTO();
		System.out.print("사용할 id 입력 :");
		memberDTO.id = input.next();
		System.out.print("사용할 pw 입력 :");
		memberDTO.pw = input.next();
		System.out.print("사용할 닉네임 입력 :");
		memberDTO.nickName = input.next();
		System.out.print("사용할 email 입력 :");
		memberDTO.email = input.next();
		// memberDTOs[10] 배열에 값을 을 0~10 삽입
		for(int i=0; i<memberDTOs.length;i++) {
			if(memberDTOs[i] == null ) {
				memberDTOs[i] = memberDTO;
				break;
			}//if
		}//for
	System.out.println(memberDTO.nickName + "님 회원가입을 축하합니다.");
	}
	
}
