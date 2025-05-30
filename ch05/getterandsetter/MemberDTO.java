package ch05.getterandsetter;

public class MemberDTO {
	// 필드
	private String name;
	private int age;
	private boolean admin;

	// 생성자

	// 메서드
	public String getName() {
		return name + "님";
	}

	public int getAge() {
		return age;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setName(String name) {
		System.out.println("이름입력은 숫자입력이 불가함니다");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("19세 이상만 입력 가능합니다");
		this.age = age;
	}

	public void setAdmin(boolean admin) {
		System.out.println("관리자일 경우 true를 입력해주세요");
		this.admin = admin;
	}

}
