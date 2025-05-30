package ch04.marioKat.DTO;

public class MemberDTO {
	//필드
	public String id; // 로그인용 id
	public String pw; // 로그인용 pw
	public String nickName; // 별명(게임용)
	public String email; // 암호찾기용

	public CharacterDTO characterDTO; // 계정별 캐릭터객체
}
