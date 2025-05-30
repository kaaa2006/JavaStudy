package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.service.HanaBankService;
import ch05.mbcbank.service.NhBankService;
import ch05.mbcbank.service.WoriBankService;

public class BankEaxm {
	// 필드

	public static Scanner inputStr = new Scanner(System.in);
	public static Scanner inputInt = new Scanner(System.in);

	public static AccountDTO[] hanaBank = new AccountDTO[10];
	public static AccountDTO[] woriBank = new AccountDTO[10];
	public static AccountDTO[] nhBank = new AccountDTO[10];
	public static AccountDTO session = null;
	// 생성자
	static {
		AccountDTO accountDTO0 = new AccountDTO("1234", "kms", 30000000, "하나");
		hanaBank[0] = accountDTO0;
		
		AccountDTO accountDTO1 = new AccountDTO("5678", "ms", 1000000, "우리");
		woriBank[0] = accountDTO1;
		
		AccountDTO accountDTO2 = new AccountDTO("9876", "ks", 500000, "농협");
		nhBank[0] = accountDTO2;
	}

	// 메서드
	public static void main(String[] args) {
		// 은행관리프로그래밍
		// 더미네이터 테스트 출력용
//		System.out.println("하나은행 더미네이터 테스트 출력용" + hanaBank[0]);
//		System.out.println("우리은행 더미네이터 테스트 출력용" + woriBank[0]);
//		System.out.println("농협은행 더미네이터 테스트 출력용" + nhBank[0]);  source -> generate to String 
		boolean run = true;
		while (run) {
			System.out.println("===============================");
			System.out.println("MBC 코인 프로그램에 오신것을 환영합니다.");
			System.out.println("===============================");
			System.out.println("1.하나은행");
			System.out.println("2.우리은행");
			System.out.println("3.농협은행");
			System.out.println("4.프로그램종료");
			System.out.print("숫자를 입력하세요. :");
			String select = inputStr.next();

			switch (select) {
			case "1":
				System.out.println("하나은행으로 진입합니다.");
				HanaBankService hanaBankService = new HanaBankService();
				HanaBankService.menu(inputStr, inputInt, hanaBank, woriBank, nhBank); // 하나뱅크 서비스 메뉴에 필요한 객체를 넣어줌
				break;
			case "2":

				System.out.println("우리은행으로 진입합니다.");
				WoriBankService woriBankService = new WoriBankService();
				WoriBankService.menu(inputStr,inputInt,hanaBank,woriBank,nhBank);
				break;
			case "3":
				System.out.println("농협은행으로 진입합니다.");
				NhBankService nhBankService = new NhBankService();
				NhBankService.menu(inputStr,inputInt,hanaBank,woriBank,nhBank);
				break;
			case "4":
				System.out.println("프로그램을 종료합니다.");
				run = false;

				break;
			default:
				System.out.println("숫자 (1~4)만 입력해주세요");
				break;
			}

		} // 주메뉴 while
	}// main method

}// class
