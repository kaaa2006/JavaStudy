package sql.board.service;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import sql.board.DAO.MemberDAO;
import sql.board.DTO.MemberDTO;

public class MemberService {
	//필드
	public MemberDAO memberDAO = new MemberDAO(); // 1,2단계 수행
	
	public void submenu(Scanner inputStr , MemberDTO session) throws SQLException {
	
		boolean subrun = true;
		
		while (subrun) {
			System.out.println("회원");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원수정");
			System.out.println("4.회원삭제");
			System.out.println("5.나가기");
			String subselect = inputStr.next(); 
			switch(subselect) {
			
			case"1" :
				System.out.println("회원가입 화면으로 이동");
				create(memberDAO,inputStr ,session );
				break;
			case"2" :
				System.out.println("로그인 화면으로 이동");
				login(memberDAO,inputStr,session);
				break;
			case"3" :
				System.out.println("계정 수정 화면으로 이동");
				update(memberDAO,inputStr);
				break;
			case"4" :
				System.out.println("계정삭제 화면으로 이동");
				delete();
				break;
			case"5" :
				System.out.println("전체계정 보기");
				memberall(memberDAO);
				break;
			case"6" :
				System.out.println("뒤로갑니다.");
				subrun = false;
				break;
			default :
				System.out.println();
				
				break;
			}
		
		
		
		
		
		}
		
		
	}

		private void memberall(MemberDAO memberDAO) throws SQLException {
			System.out.println("모든 계정 보기 리스트");
			memberDAO.memberAll();
			System.out.println("----------------------");
	}

		private void delete() throws SQLException {
		//삭제 
			// 게시물의 번호를 받아 삭제한다.
			System.out.println("id :");
			
			Scanner input = new Scanner(System.in);
			System.out.print(">>>");
			String selectid = input.next();
			
			memberDAO.delete(selectid);
			
		
	}

		private void update(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
		// 수정
			
			 System.out.println("=================================");
		      System.out.println("========수정할 회원의 id를 입력하세요.========");
		      System.out.println("=================================");
		      System.out.print("ID : ");
		      String id = inputStr.next();
		      
		      
		      
		      memberDAO.update(id, inputStr);
		      System.out.println("=================================");
		      System.out.println("==========회원용 메뉴로 돌아갑니다.==========");
		      System.out.println("=================================");
	}

		private void login(MemberDAO memberDAO, Scanner inputStr, MemberDTO session) throws SQLException {
		// 로그인 
		System.out.print("id :");
		session.setId(inputStr.next());
		System.out.print("pw :");
		session.setPw(inputStr.next());
		
		memberDAO.login(session);
		System.out.println("변");
		
	}

		private void create(MemberDAO memberDAO, Scanner inputStr, MemberDTO session) throws SQLException {
		MemberDTO memberDTO = new MemberDTO();
		System.out.print("이름 :");
		session.setBwriter(inputStr.next());
		System.out.print("생성할 id :");
		session.setId(inputStr.next());
		System.out.print("생성할 pw :");
		session.setPw(inputStr.next());

		
		memberDAO.create(session);
	}

	

}
