package sql.board.DTO;

public class MemberDTO {
	//계정 객체 담당
	//필드 
	private String bwriter;
	private String id;
	private String pw;

	//기본생성자
	
	
//메서드 게터세터
	private int mno;
	public int getMno() {
		return mno;
	}
	public String getBwriter() {
		return bwriter;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}







}
