package sql.board.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



import oracle.net.aso.p;
import oracle.net.ns.SessionAtts;
import sql.board.DTO.BoardDTO;
import sql.board.DTO.MemberDTO;

public class MemberDAO {

	// 멤버의 db와 연동 담당
	
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null; //1단계 사용
	public Statement stmt = null; //3단계서 사용
	public PreparedStatement pstmt = null;//3단계서 사용
	public ResultSet resultset = null;   //4단계에서 결과받는 표 객체 select  결과  executeUpdate
	public int result = 0 ;  //4단계에서 결과받는 정수	insert update delete 결과
				 
	//1개의 행이 삽입 || 수정 || 삭제 되었습니다 = 정상처리 -> commit   
	//0개의 행이 삽입 || 수정 || 삭제 되었습니다 = 비정상 -> rollback
	//기본 생성자 
	public MemberDAO() {
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
		
		
			
	} //기본생성자 종료
	
	
	
	


		public void create(MemberDTO session ) throws SQLException {
			try {
				String sql = "insert into member (mno, bwriter ,id, pw) values (board_seq.nextval, ? , ? , ? )";
			
			pstmt=connection.prepareStatement(sql);
			pstmt.setString(1, session.getBwriter());
			pstmt.setString(2, session.getId());
			pstmt.setString(3, session.getPw());
			System.out.println("쿼리 확인 "+ sql); 
			
			result = pstmt.executeUpdate();  //쿼리문 실행해서 결과로 정수를 받음 
			
			if(result>0) {
				System.out.println(result + "개의 계정이 등록되었습니다.");
				connection.commit();
				
			}else {
				System.out.println("쿼리 실행과정 "+ result);
				System.out.println("입력 실패");
				connection.rollback();
				
			}
			}catch(SQLException e){
				System.out.println("예외발생");
				e.printStackTrace();
			}finally {
				pstmt.close();
			}
			
		}






		public MemberDTO login(MemberDTO session) throws SQLException {
			// db와 연동하여 로그인
			
			try {
				String sql = "select * from member where  id=? and pw=? ";
				pstmt=connection.prepareStatement(sql);
				pstmt.setString(1, session.getId());
				pstmt.setString(2, session.getPw());
				
				resultset = pstmt.executeQuery();
				
				if(resultset.next()) {
					session.setMno(resultset.getInt("mno"));
					session.setBwriter(resultset.getString("bwriter"));
					session.setId(resultset.getString("id"));
					session.setPw(resultset.getString("pw"));
					
					return session;
					
					
					
				
				}else {
					System.out.println("로그인 실패");
					
					
				}
			} catch (SQLException e) {
				System.out.println("로그인 메서드나 DAO를 확인해주세요");
				e.printStackTrace();
			}finally {
				pstmt.close();
				resultset.close();
			}
			return session;
			
			
			
			
			
		}






		public void update( String id, Scanner inputStr) throws SQLException {
			 System.out.println("=================================");
		      System.out.println("==========새로운 정보를 입력하세요.==========");
		      System.out.println("=================================");
		      System.out.print("이름 : ");
		      memberDTO.setBwriter(inputStr.next());
		      System.out.println("=================================");
		      System.out.print("ID : ");
		      memberDTO.setId(inputStr.next());
		      System.out.println("=================================");
		      System.out.print("PW : ");
		      memberDTO.setPw(inputStr.next());
		      System.out.println("=================================");
		      try {
		          String sql = "update member set bwriter = ?, id = ?, pw = ? where id = ?";
		          
		          pstmt = connection.prepareStatement(sql);
		          pstmt.setString(1, memberDTO.getBwriter());
		          pstmt.setString(2, memberDTO.getId());
		          pstmt.setString(3, memberDTO.getPw());
		          pstmt.setString(4, id);
		          
		          result = pstmt.executeUpdate();
		          
		          if(result > 0) {
		             System.out.println(result + "명의 정보가 수정되었습니다.");
		             connection.commit();
		          }else {
		             System.out.println("입려한 id는 없는 id입니다.");
		             System.out.println("다시 확인헤주세요.");
		             connection.rollback();
		          }
		       }catch(SQLException e) {
		          System.out.println("mbModify() 메서드 쿼리문을 확인하세요.");
		          e.printStackTrace();
		       }finally {
		    	   pstmt.close();
		    	   
			
		}

		}




		public void delete(String selectid) throws SQLException {
			//삭제  
			try {
				String sql = "delete from member where id = ?";
				pstmt=connection.prepareStatement(sql);
				pstmt.setString(1, selectid);
				
				result=pstmt.executeUpdate();
				if(result>0) {
					System.out.println(result + "계정 삭제");
					connection.commit();
				}else {
					System.out.println("계정 삭제 안됨");
					connection.rollback();			
				}
				System.out.println("===========================");
				memberAll(); // 삭제후 전체 리스트 보기 
						
						
			} catch (SQLException e) {
				System.out.println("예외발생 : deleteone메서드와 sql문을 확인하세요");
				e.printStackTrace();
			} finally {
				pstmt.close();
				
			}
			
		}






		public void memberAll() throws SQLException {
		try {
			String sql = "select mno,bwriter,id,pw, from member order by id desc";
			//데이터베이스에 board 테이블 내용을 가져오는 쿼리문 
			stmt = connection.createStatement(); //쿼리문을 실행할 객체 생성
			resultset = stmt.executeQuery(sql);  //쿼리문을 실행하여 결과를 표로 받는다.
			
			System.out.println("번호\t 이름\t id\t pw\t");
			while(resultset.next()) {
				//결과표의 위에서 아래까지 내려오면서 출력
				System.out.print(resultset.getInt("mno")+"\t");
				System.out.print(resultset.getString("bwriter")+"\t");
				System.out.print(resultset.getString("id")+"\t");
				System.out.println(resultset.getDate("pw")+"\t");
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
}
		