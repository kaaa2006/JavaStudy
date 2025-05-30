package test.service;

import java.util.Scanner;
import test.DTO.MemberDTO;
import test.DTO.TotalDTO;

public class TestService {

	public static void menu(Scanner inputStr, Scanner inputInt, TotalDTO totalDTO) {
		boolean run = true;
		while (run) {
			System.out.println("점수관리");
			System.out.println("1. 점수 입력");
			System.out.println("2. 점수 조회");
			System.out.println("3. 점수 수정");
			System.out.println("4. 점수 삭제");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			String select = inputStr.next();

			switch (select) {
			case "1":
				ScoreAdd(inputInt, inputStr, totalDTO);
				break;
			case "2":
				ScoreList(totalDTO);
				break;
			case "3":
				Uptd(inputInt, inputStr, totalDTO);
				break;
			case "4":
				delete(inputInt, totalDTO);
				break;
			case "5":
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void Uptd(Scanner inputInt, Scanner inputStr, TotalDTO totalDTO) {
		// 수정용 메서드

	}

	private static void delete(Scanner inputInt, TotalDTO totalDTO) {
		// 삭제용 메서드

	}

	private static void ScoreList(TotalDTO totalDTO) {
		// 전체점수보기
		if (totalDTO.getTotal() == 0) {
			System.out.println("입력된 점수가 없습니다.");
			return;
		}
		System.out.println("[점수 조회]");
		System.out.println("국어: " + totalDTO.getKors());
		System.out.println("수학: " + totalDTO.getMats());
		System.out.println("영어: " + totalDTO.getEngs());
		System.out.println("총점: " + totalDTO.getTotal());
		System.out.printf("평균:", totalDTO.getAvg());
	}

	private static void ScoreAdd(Scanner inputInt, Scanner inputStr, TotalDTO totalDTO) {
		// 점수 입력메서드
		System.out.print("국어 점수: ");
		int kor = inputInt.nextInt();
		System.out.print("수학 점수: ");
		int mat = inputInt.nextInt();
		System.out.print("영어 점수: ");
		int eng = inputInt.nextInt();

		int sum = kor + mat + eng;
		double avg = sum / 3.0; //소숫점이기에

		totalDTO.setKors(kor);
		totalDTO.setMats(mat);
		totalDTO.setEngs(eng);
		totalDTO.setTotal(sum);
		totalDTO.setAvg(avg);

		System.out.println("점수가 입력되었습니다.");
	}

}
