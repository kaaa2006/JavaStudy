package sql.board;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import sql.board.DTO.MemberDTO;
import sql.board.service.BoardService;
import sql.board.service.MemberService;

public class BoardExam {

	
	public static Scanner inputStr = new Scanner(System.in); 
	public static MemberDTO session = new MemberDTO();
	
	public static void main(String[] args) throws SQLException {
		
		boolean run = true;
		
		while (run) {
			System.out.println("자유게시판 입니다.");
			System.out.println("1.회원");
			System.out.println("2.게시판");
			System.out.println("3.종료");
			System.out.print(">>>");
			String select = inputStr.next();
			
		switch(select) {
		case "1" :
			System.out.println("회원 서비스로 진입합니다.");
			MemberService memberservice = new MemberService();
			memberservice.submenu(inputStr,session);
			break;
		case "2" :
			System.out.println("게시판 서비스로 진입합니다");
			BoardService boardservice = new BoardService(); 
			boardservice.submenu(inputStr);
			break;
		case "3" :
			System.out.println("종료합니다.");
			run=false; 
			break;
		default :
			System.out.println("잘못 입력 하셨습니다.");
			
			break;
		}//스위치문 종료
		
		
		
		}//와이드문 종료
		

	}//메인 메서드 종료

	

}//클래스 종료
