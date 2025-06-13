package membertest.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import membertest.DTO.memberDTO;

public class memberDAO {
	public memberDTO memberDTO = new memberDTO();
//멤버의 db와 연동 담당
	public memberDTO memberdto = new memberDTO();
	public Connection connection = null; // 1단계 사용
	public Statement stmt = null; // 3단계서 사용
	public PreparedStatement pstmt = null;// 3단계서 사용
	public ResultSet resultset = null; // 4단계에서 결과받는 표 객체 select 결과 executeUpdate
	public int result = 0; // 4단계에서 결과받는 정수 insert update delete 결과

//기본생성자 
	public memberDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.169:1521:xe", "membertest",
					"membertest");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름 또는 ojdbc6.jar 파일을 확인해주세요");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("ULR,ID,PW 가 잘못되었거나 BoardDAO에 기본생성자를 확인해주세요.");
			e.printStackTrace();
			System.exit(0);
		}
		
	}// 기본생성자 종료

	public void create(memberDTO session) throws SQLException {
		// 회원가입
		try {
			String sql = "insert into member (mno,name,id,pw) values (member_seq.nextval,?,?,?)";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, session.getName());
			pstmt.setString(2, session.getId());
			pstmt.setString(3, session.getPw());
			System.out.println("쿼리 확인 " + sql);

			result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result + "개의 계정이 등록되었습니다");
				connection.commit();
				System.out.println(session.getName() + "님 환영합니다!");

			} else {
				System.out.println("쿼리 실행과정 " + result);
				System.out.println("회원가입 실패");
				connection.rollback();
			}
		} catch (SQLException e) {
			System.out.println("예외발생");
			e.printStackTrace();
		} finally {
			pstmt.close();
		}

	}// 회원가입 종료

	public memberDTO login(memberDTO session) throws SQLException {
		// 로그인

		try {
			String sql = "select * from member where id=? and pw=? ";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, session.getId());
			pstmt.setString(2, session.getPw());

			resultset = pstmt.executeQuery();

			if (resultset.next()) {
				session.setMno(resultset.getInt("mno"));
				session.setName(resultset.getString("name"));
				session.setId(resultset.getString("id"));
				session.setPw(resultset.getString("pw"));
				System.out.println("로그인 성공!!");
				System.out.println(session.getName() + "님 반가워요!");

				return session;
			} else {
				System.out.println("로그인 실패");
				System.out.println("id또는pw가 틀렸습니다.");

			}
		} catch (SQLException e) {
			System.out.println("로그인 메서드,DAO를 확인해주세요.");
			e.printStackTrace();
		} finally {
			pstmt.close();
			resultset.close();
		}
		return session;

	}//

	public void update(String bid, Scanner inputStr, memberDTO session) throws SQLException {
		// 계정 데이터 수정 id를 찾아 계정데이터 수정
		memberDTO memberdto = new memberDTO();
		System.out.println(bid + "님의 계정을 수정합니다.");

		System.out.println("===새로운 정보를 입력하세요===");
		System.out.print("id :");
		String newid = inputStr.next();
		System.out.println("pw :");
		String newpw = inputStr.next();

		session.setId(newid);
		session.setPw(newpw);

		PreparedStatement pstmt = null;

		try {
			String sql = "update member set id=?, pw=?, regidate=sysdate where id=?";

			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, session.getId());
			pstmt.setString(2, session.getPw());
			pstmt.setString(3, bid);
			result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println(result + "명의 정보가 수정되었습니다.");
				connection.commit();
			} else {
				System.out.println("입려한 id는 없는 id입니다.");
				System.out.println("다시 확인헤주세요.");
				connection.rollback();
			}

		} catch (Exception e) {
			System.out.println("upadte()메서드 쿼리문을 확인해주세요");
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				pstmt.close();
		}

	}

	public void memberAll() throws SQLException {
		// 전체계정 보기
		try {
			String sql = "select mno,name,id,pw,regidate from member order by regidate desc";
			// 데이터베이스에 board 테이블 내용을 가져오는 쿼리문
			stmt = connection.createStatement(); // 쿼리문을 실행할 객체 생성
			resultset = stmt.executeQuery(sql); // 쿼리문을 실행하여 결과를 표로 받는다.

			System.out.println("번호\t 이름\t id\t pw\t");
			while (resultset.next()) {
				// 결과표의 위에서 아래까지 내려오면서 출력
				System.out.print(resultset.getInt("mno") + "\t");
				System.out.print(resultset.getString("name") + "\t");
				System.out.print(resultset.getString("id") + "\t");
				System.out.println(resultset.getString("pw") + "\t");
				System.out.println(resultset.getDate("regidate") + "\t");

			}
			System.out.println("========끝=========");
		} catch (SQLException e) {
			// 오류 발생시 예외처리문
			System.out.println("selectAll()메서드에 쿼리문이 잘못 되었습니다.");
			e.printStackTrace();

		} finally {
			// 항상 실행문
			resultset.close();
			stmt.close();
			// connection.close(); //열림객체를 닫아야 다른 메서드도 정상 작동한다.
		}
	}

	public void deid(String deid) throws SQLException {
		// 삭제
		try {
			String sql = "delete from member where id = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, deid);
			result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result + "계정이 삭제되었습니다.");
				connection.commit();
			} else {
				System.out.println("id를 확인해주세요");
				connection.rollback();
			}
			memberAll(); // 삭제후 계정리스트 보기
		} catch (Exception e) {
			System.out.println("===========================");
			e.printStackTrace();

		} finally {
			pstmt.close();
		}

	}

	
	
	
	
	
	
	public  memberDTO logininsert(Scanner inputStr, membertest.DTO.memberDTO session, String boid, String bopw) throws SQLException {
		// 로그인하고 게시판 
		try{
		String sql = "select * from member where id=? and pw=? ";
		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, session.getId());
		pstmt.setString(2, session.getPw());

		resultset = pstmt.executeQuery();

		if (resultset.next()) {
			session.setMno(resultset.getInt("mno"));
			session.setName(resultset.getString("name"));
			session.setId(resultset.getString("id"));
			session.setPw(resultset.getString("pw"));
			System.out.println("로그인 성공!!");
			System.out.println(session.getName() + "님 반가워요!");

			System.out.println("게시판모드에 들어오셨습니다.");
			
			System.out.print("제목 :");
			session.setBtitle(inputStr.next());
			System.out.print("내용 :");
			session.setBcontent(inputStr.next());
			System.out.print("작성자 :");
			session.setBwriter(inputStr.next());
			
		
		
		
		
		
			return session;
		} else {
			System.out.println("로그인 실패");
			System.out.println("id또는pw가 틀렸습니다.");

		}
	} catch (SQLException e) {
		System.out.println("로그인 메서드,DAO를 확인해주세요.");
		e.printStackTrace();
	} finally {
		pstmt.close();
		resultset.close();
	}
	return session;

}//

	
	
	

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
		
	}

