package sql.board.DTO;

import java.sql.Date;

public class BoardDTO {
//게시판 객체 담당
	//필드
	private int bno; // 번호 
	private String btitle; //제목
	private String bcontent; //내용
	private String bwriter; //작성자 
	private Date  bdate; //작성일
	
	
	// 기본생성자 
	
	
	
	
	
	
	//게터(출력)세터(입력)
	public int getBno() {
		return bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
