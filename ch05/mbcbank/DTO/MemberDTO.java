package ch05.mbcbank.DTO;

public class MemberDTO {
	
	
	private String stnum = null; 	// 성적처리 프로그램 아이디를 만들수 있는 객체 생성
	private String stpw = null;  	// 성적처리 프로그램 비밀번호	만들수 있는 객체 생성
	private String thID = "kms"; 
	private String thPW = "1234";
	
	//private이기 때문에 다른곳에 쓸 게터 세터 생성
	public String getStnum() {
		return stnum;
	}
	public String getStpw() {
		return stpw;
	}
	public String getThID() {
		return thID;
	}
	public String getThPW() {
		return thPW;
	}
	public void setStnum(String stnum) {
		this.stnum = stnum;
	}
	public void setStpw(String stpw) {
		this.stpw = stpw;
	}
	public void setThID(String thID) {
		this.thID = thID;
	}
	public void setThPW(String thPW) {
		this.thPW = thPW;
	} 
}
