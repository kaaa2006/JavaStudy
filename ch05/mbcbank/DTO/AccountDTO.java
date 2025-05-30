package ch05.mbcbank.DTO;

public class AccountDTO { //부모로 생성하면 자식객체들은 상속받아 필드생성자메서드를 사용할 수 있다
	// 필드
	private String ano; // 계좌번호
	public String owenr; // 계좌주
	private int balance; // 입금액
	private String bankname; // 은행명

	// 생성자
	public AccountDTO(String ano, String owenr, int balance, String bankname) {
		// super();
		this.ano = ano;
		this.owenr = owenr;
		this.balance = balance;
		this.bankname = bankname;
	}
	// 기본생성자

	// *get = 출력시 변조 담당*
	// *set = 입력시 검증 처리용*
	public AccountDTO() {
		// super();
	}

	// 메서드
	public String getAno() {
		return ano;
	}

	public String getOwenr() {
		return owenr;
	}

	public int getBalance() {
		return balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwenr(String owenr) {
		this.owenr = owenr;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public String toString() { // source -> generate to String
		return "AccountDTO [ano=" + ano + ", owenr=" + owenr + ", balance=" + balance + ", bankname=" + bankname + "]";
	}

}
