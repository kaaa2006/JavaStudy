package test.DTO;

public class MemberDTO {
	// 필드 부모 DTO
	private String ids; // 회원가입,로그인 id
	private String pws; // 회원가입,로그인 pw
	private String names; // 회원가입,로그인 이름

	// 생성자 게터 세터
	public String getIds() {
		return ids;
	}

	public String getPws() {
		return pws;
	}

	public String getNames() {
		return names;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public void setPws(String pws) {
		this.pws = pws;
	}

	public void setNames(String names) {
		this.names = names;
	}

}
