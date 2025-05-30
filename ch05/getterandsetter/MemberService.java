package ch05.getterandsetter;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class MemberService {
//부메뉴 구현
	MemberDTO memberDTO = new MemberDTO();

	// 생성자

	// 메서드
	public void menu() {

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("이름을 입력하세요 :");
		String name = input.next();

		System.out.print("나이를 입력하세요 :");
		int age = input.nextInt();

		System.out.print("관리자 유무을 입력해주세요 :");
		boolean admin = input.nextBoolean();

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setName(name);
		memberDTO.setAge(age);
		memberDTO.setAdmin(admin);

		System.out.println("이름 :" + memberDTO.getName());
		System.out.println("나이 :" + memberDTO.getAge());
		System.out.println("관리자 :" + memberDTO.isAdmin());

	}

}
