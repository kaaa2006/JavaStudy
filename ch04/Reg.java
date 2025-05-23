package ch04;

public class Reg {
	//필드 
	public String id; //회원가입 아이디
	public String pw; //회원가입 비번
	public String birday; // 회원가입 회원 데이터에 필요한 생일
	public String mail; // 회원가입 메일 
	public String number; // 회원가입 전화번
	public String adderss; //회원가입 주소 
	
	//생성자 
	Reg() { //기본생성
		
	}
	Reg(String id){
		this.id = id;
	}
	Reg(String id,String pw){
		this.id = id;
		this.pw = pw;
	}
	Reg(String id,String pw,String address){
		
	}
	
	
	
	
	//메서드
}
