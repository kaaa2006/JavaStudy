package sql.board.service;

import java.sql.SQLException;
import java.util.Scanner;

import sql.board.DAO.BoardDAO;
import sql.board.DTO.BoardDTO;

public class BoardService {
	//필드 
	public BoardDAO boardDAO = new BoardDAO();//boardDAO 1,2단계 수행
			
	 
	public void submenu(Scanner inputStr) throws SQLException {
		// TODO Auto-generated method stub
		boolean subrun = true; 
		
		while (subrun) {
			System.out.println("게시판");
			System.out.println("1,모두 보기"); //모든 게시물 보기 화면으로 이동
			System.out.println("2.게시글 작성");
			System.out.println("3.게시글 자세히 보기");
			System.out.println("4.게시글 수정");
			System.out.println("5.게시글 삭제");
			System.out.println("6.나가기");
			System.out.print(">>>");
			String subselect = inputStr.next();
		switch(subselect) {
		case"1":
			System.out.println("모두 보기");
			selectAll(boardDAO);
			break;
		case"2":
			System.out.println("게시글 작성");
			insertBoard(boardDAO,inputStr);
			break;
		case"3":
			System.out.println("게시글 자세히 보기");
			readone (inputStr);
			break;
		case"4":
			System.out.println("게시글 수정");
			modify(inputStr);
			break;
		case"5":
			System.out.println("게시물 삭제");
			deleteone();
			break;
		case"6":
			System.out.println("나가기");
			subrun = false;
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			
			break;
		}
		
		
		
		
		
		
		}
		
		
	}


	private void deleteone() throws SQLException {
		// TODO Auto-generated method stub
System.out.println("삭제하려는 게시글의 번호를 입력하세요");
		
		Scanner inputInt = new Scanner(System.in);
		System.out.print(">>>");
		int selectBno = inputInt.nextInt();
		
		boardDAO.deleteone(selectBno);
	}


	private void modify(Scanner inputStr) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("수정하고 싶은 게시글의 제목을 입력하세요");
		System.out.print(">>>");
		String title = inputStr.next();
		
	boardDAO.modify(title, inputStr);
	System.out.println("===========끝===========");
	}



	private void readone(Scanner inputStr) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("보고싶은 게시글의 제목을 입력하세요");
		System.out.print(">>>");
		String title = inputStr.next();
		
		boardDAO.readone(title);
		System.out.println("======끝=====");
	}//readone


	private void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		// 키보드로 입력한 데이터를 DTO를 사용하여 데이터베이스에 들어가는 서비스 
		BoardDTO boardDTO = new BoardDTO();//빈객체 생성
		Scanner inputLine = new Scanner(System.in);
		
		System.out.print("작성자 :");
		boardDTO.setBwriter(inputStr.next());
		
		System.out.print("제목 :");
		boardDTO.setBtitle(inputStr.next());
		
		System.out.print("내용 :");
		boardDTO.setBcontent(inputLine.nextLine());
		
		boardDAO.insertBoard(boardDTO); //위에 만든 객체를 DAO에 가지고 감
		System.out.println("insertBoard 메서드 종료");
	}


	private void selectAll(BoardDAO boardDAO) throws SQLException {
		// DAO에게 전체 보기 하는 서비스 제공
		System.out.println("--------------------");
		System.out.println("-----게시판 목록-----");
		boardDAO.selectAll();
		System.out.println("---------------------");
	}

}
