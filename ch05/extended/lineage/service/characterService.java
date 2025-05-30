package ch05.extended.lineage.service;

import java.util.Scanner;

import ch05.extended.lineage.DTO.Account;
import ch05.extended.lineage.DTO.ElfDTO;
import ch05.extended.lineage.DTO.KnightDTO;

public class characterService {
	// 객체를 이용하여 캐릭터 선택용 부메뉴
	public static void menu(Scanner scanner, Account loginAccount, KnightDTO knightDTO, ElfDTO elfDTO) {
		System.out.println("|1.기사|2.요정|3.마법사|4.도적|5.군주|6.총사|7.종료|");
		System.out.print(">>>");
		
	}

}
