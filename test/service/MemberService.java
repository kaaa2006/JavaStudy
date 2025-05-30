package test.service;

import java.util.Scanner;
import test.DTO.MemberDTO;

public class MemberService {

	public static void menu(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTOs, MemberDTO loginState) {
		boolean subrun = true;
		System.out.println("회원관리 메뉴로 진입하셨습니다");

		while (subrun) {
			System.out.println("1.회원가입 | 2.로그인 | 3.수정 | 4.삭제 | 5.뒤로가기");
			System.out.print(">>> ");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("계정을 생성합니다");
				create(inputInt, inputStr, memberDTOs);
				break;
			case "2":
				System.out.println("로그인 하기");
				login(inputStr, inputInt, memberDTOs);
				break;
			case "3":
				System.out.println("회원 수정");
				update(inputStr, inputInt, memberDTOs);
				break;
			case "4":
				System.out.println("삭제");
				delete(inputStr, inputInt, memberDTOs);
				break;
			case "5":
				System.out.println("뒤로가기");
				subrun = false;
				break;
			default:
				System.out.println("잘못된 선택입니다.");
			}// switch
		} // while
	}// 메서드

	private static void create(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTOs) {
		// 회원가입
		MemberDTO memberDTO = new MemberDTO();

		System.out.print("사용할 ID: ");
		memberDTO.setIds(inputStr.next());

		System.out.print("비밀번호: ");
		memberDTO.setPws(inputStr.next());

		System.out.print("닉네임: ");
		memberDTO.setNames(inputStr.next());

		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] == null) {
				memberDTOs[i] = memberDTO;
				System.out.println("회원가입이 완료되었습니다.");
				return;
			}
		}

		System.out.println("회원 목록이 가득 찼습니다.");
	}

	private static void login(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs) {
		// 로그인
		System.out.print("ID 입력: ");
		String id = inputStr.next();
		System.out.print("비밀번호 입력: ");
		String pw = inputStr.next();

		for (MemberDTO dto : memberDTOs) {
			if (dto != null && dto.getIds().equals(id) && dto.getPws().equals(pw)) {
				System.out.println("로그인 성공! 환영합니다, " + dto.getNames() + "님");
				return;
			}
		}
		System.out.println("로그인 실패. 아이디 또는 비밀번호가 일치하지 않습니다.");
	}

	private static void update(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs) {
		// 회원수정
		System.out.print("ID 입력: ");
		String id = inputStr.next();

		for (MemberDTO dto : memberDTOs) {
			if (dto != null && dto.getIds().equals(id)) {
				System.out.print("새 비밀번호 입력: ");
				dto.setPws(inputStr.next());
				System.out.println("비밀번호가 수정되었습니다.");
				return;
			}
		}
		System.out.println("해당 ID를 찾을 수 없습니다.");
	}

	private static void delete(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTOs) {
		// 회원삭제
		System.out.print("ID 입력: ");
		String id = inputStr.next();

		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] != null && memberDTOs[i].getIds().equals(id)) {
				memberDTOs[i] = null;
				System.out.println("회원이 삭제되었습니다.");
				return;
			}
		}
		System.out.println("해당 ID를 찾을 수 없습니다.");
	}
}
