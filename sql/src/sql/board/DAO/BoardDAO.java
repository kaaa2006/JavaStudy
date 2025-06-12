package sql.board.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import sql.board.DTO.BoardDTO;
	
public class BoardDAO {

	// 게시판의 db와 연동 담당
		// jdbc 5단계 사용
		// 1단계 :connect 객체를 사용하여 ojdbc6 을 생성
		// 2단계 : url id pw sql 쿼리문 작성
		// 3단계 : 쿼리문 실행
		// 4단계 : 쿼리문 실행결과 받기
		// 5단계 : 연결 종료를 진행
	// 필드
	public BoardDTO boardDTO = new BoardDTO();
	public Connection connection = null; //1단계 사용하는 객체 
	public Statement stmt = null; 		  //3단계에서 사용하는 객체 구형	
	public PreparedStatement pstmt = null; // 3단계에서 사용하는 객체 신형	 executeQuary
	public ResultSet resultset = null;   //4단계에서 결과받는 표 객체 select  결과  executeUpdate
	public int result = 0 ; 			  //4단계에서 결과받는 정수	insert update delete 결과
	//1개의 행이 삽입 || 수정 || 삭제 되었습니다 = 정상처리 -> commit   
	//0개의 행이 삽입 || 수정 || 삭제 되었습니다 = 비정상 -> rollback
	//기본 생성자 
	public BoardDAO() {
		try {
			//예외 발생 가능있는 실행문 프로그램 강제 종료 처리용
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","boardtest","boardtest");
	
		}catch(ClassNotFoundException e) {
		System.out.println("드라이버 이름 또는 ojdbc6.jar 파일이 잘못 되었습니다.");
		e.printStackTrace();
		System.exit(0);
		}catch(SQLException e) {
		System.out.println("ULR,ID,PW 가 잘못되었거나 BoardDAO에 기본생성자를 확인해주세요.");
		e.printStackTrace();
		System.exit(0); // 강제종료
	}
		
	
}//기본생성자 종료
	public void selectAll() throws SQLException {
		// TODO Auto-generated method stub
		try {
			String sql = "select bno,btitle,bwriter,bdate from board order by bdate desc";
			//데이터베이스에 board 테이블 내용을 가져오는 쿼리문 
			stmt = connection.createStatement(); //쿼리문을 실행할 객체 생성
			resultset = stmt.executeQuery(sql); //쿼리문을 실행하여 결과를 표로 받는다.
			
			System.out.println("번호\t 제못\t 작성자\t 작성일\t");
			while(resultset.next()) {
				//결과표의 위에서 아래까지 내려오면서 출력
				System.out.print(resultset.getInt("bno")+"\t");
				System.out.print(resultset.getString("btitle")+"\t");
				System.out.print(resultset.getString("bwriter")+"\t");
				System.out.println(resultset.getDate("bdate")+"\t");
				
			}
			System.out.println("========끝=========");
		}catch(SQLException e) {
			// 오류 발생시 예외처리문 
			System.out.println("selectAll()메서드에 쿼리문이 잘못 되었습니다.");
			e.printStackTrace();
			
		}finally {
		 //항상 실행문 
			resultset.close();
			stmt.close();
			//connection.close(); //열림객체를 닫아야 다른 메서드도 정상 작동한다.
	}
}
	public void insertBoard(BoardDTO boardDTO) throws SQLException {
		// jdbc를 이용하여 insert 쿼리문을 처리한다
				//PreparedStatement문을 사용해보자 
				//동적쿼리문 이라고 하고 (?)를 사용해서 세터로 입력한다.
		
		
		
		try {
			String sql = "insert into board(bno, btitle, bcontent, bwriter, bdate)values (board_seq.nextval,?,?,?, sysdate)";
			
			pstmt=connection.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getBtitle());
			pstmt.setString(2, boardDTO.getBcontent());
			pstmt.setString(3, boardDTO.getBwriter());
			System.out.println("쿼리 확인 "+ sql); 
			
			result = pstmt.executeUpdate(); //쿼리문 실행해서 결과로 정수를 받음 
			
			if(result>0) {
				System.out.println(result + "개의 게시물이 등록되었습니다.");
				connection.commit();
				
			}else {
				System.out.println("쿼리 실행과정 "+ result);
				System.out.println("입력 실패");
				connection.rollback();
				
			}
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("예외 발생 : insertBoard() 메서드에 쿼리문을 확인하세요.");
			e.printStackTrace();
		}finally {
			//예외 발생 및 정장 실행후 무조건 처리되는 실행문 
			pstmt.close();
			//connection.close();
				
		}
		
		
		
	}
	public void readone(String title) throws SQLException {
		// 제목 문자열이 넘어온 것을 select 처리하여 출력 
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate form board where btitle = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, title); // service 에서 넘어온 찾고 싶은 제목이 ?로 넘어간다.
			resultset = pstmt.executeQuery(); //쿼리문 실행 후 결과로 표로 받는다
		if(resultset.next()) {
			// 검색 결과가 있을시 
			BoardDTO boardDTO = new BoardDTO(); //빈객체 생성
			boardDTO.setBno(resultset.getInt("bno"));
			boardDTO.setBtitle(resultset.getString("btitle"));
			boardDTO.setBcontent(resultset.getString("content"));
			boardDTO.setBwriter(resultset.getString("bwriter"));
			boardDTO.setBdate(resultset.getDate("bdate"));
			//데이터 베이스에 있는 행을 객체에 넣기 완료 
			
			System.out.println("==============================");
			System.out.println("번호 : " + boardDTO.getBno());
			System.out.println("제목 : " + boardDTO.getBtitle());
			System.out.println("내용 : " + boardDTO.getBcontent());
			System.out.println("작성자 : " + boardDTO.getBwriter());
			System.out.println("작성일 : " + boardDTO.getBdate());
		}else {
			// 검색 결과가 없을시
			System.out.println("해당하는 게시물이 없습니다.");
		}//if문이 없습니다.
		
		}catch(SQLException e) {
			System.out.println("예외발생 : readOne() 메서드를 확인하세요");
			e.printStackTrace();
		}finally {
			//항상 실행문 
			resultset.close();
			pstmt.close();
		}
		
	}
	public void modify(String title, Scanner inputStr) throws SQLException {
		// 제목을 찾아서 내용을 수정한다.
		BoardDTO boardDTO = new BoardDTO();
		
		System.out.println("수정할 내용을 입력하세요");
		System.out.print(">>>");
		boardDTO.setBtitle(inputStr.next());
		Scanner inputLine = new Scanner(System.in);
		System.out.print("내용 : ");
		boardDTO.setBcontent(inputLine.nextLine());
		
		
			try {
				String sql = "update board set btitle = ? , bcontent = ? , bdate = sysdate where btitle=? ";
				pstmt = connection.prepareStatement(sql);
				pstmt.setString(1, boardDTO.getBtitle());
				pstmt.setString(2, boardDTO.getBcontent());
				pstmt.setString(3, title);
				
				result = pstmt.executeUpdate(); //쿼리문 실행후 결과를 정수로 보낸다
			
				if (result > 0 ) {
					System.out.println(result +"개의 데이터가 수정되었습니다");
					connection.commit();
				}else {
					System.out.println("예외발생 : modify 메서드 sql을 확인하세요");
				}
			
			
			
			
			} catch (Exception e) {
				System.out.println("예외발생");
				e.printStackTrace();
			}finally {
				pstmt.close();
			}
			
	}
	public void deleteone(int selectBno) throws SQLException {
		// TODO Auto-generated method stub
		try {
			String sql= "delete from board where bno = ?";
			pstmt =connection.prepareStatement(sql);
			pstmt.setInt(1, selectBno);
			
			result = pstmt.executeUpdate(); 
			
			if(result>0) {
				System.out.println(result + "게시물 삭제");
				connection.commit();
			}else {
				System.out.println("게시물 삭제 안됨");
				connection.rollback();			
			}
			System.out.println("===========================");
			selectAll(); // 삭제후 전체 리스트 보기 
			
			
			
		} catch (SQLException e) {
			System.out.println("예외발생 : deleteone메서드와 sql문을 확인하세요");
			e.printStackTrace();
		} finally {
			pstmt.close();
			
		}
	}
}