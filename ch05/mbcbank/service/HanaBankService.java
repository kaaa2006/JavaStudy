package ch05.mbcbank.service;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;

public class HanaBankService { // 서비스 계층은 CRUD위주로 구성한다
	// 필드

	// 생성자

	// 메서드=부메뉴 (계좌개설, 예금,출금,이체 등....)

	public static void menu(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank, AccountDTO[] woriBank,
			AccountDTO[] nhBank) {
		boolean subRun = true;

		while (subRun) {
			System.out.println("----------------------------------");
			System.out.println("하나은행 계좌관리로 이동하셨습니다.");
			System.out.println("----------------------------------");
			System.out.println("1.계좌개설");
			System.out.println("2.계좌목록");
			System.out.println("3.예금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.뒤로가기");
			System.out.print("숫자를 입력해주세요 :");
			String subSelect = inputStr.next();
			switch (subSelect) {
			case "1":
				System.out.println("계좌개설 페이지로 이동하셨습니다.");
				OpenanAccount(inputStr, inputInt, hanaBank);
				break;
			case "2":
				System.out.println("계좌목록 페이지로 이동하셨습니다.");
				AccountLists(inputStr, inputInt, hanaBank);
				break;
			case "3":
				System.out.println("계좌입금 페이지로 이동하셨습니다.");
				deposit(inputStr, inputInt, hanaBank);
				break;
			case "4":
				System.out.println("계좌출금 페이지로 이동하셨습니다.");
				withdraw(inputStr, inputInt, hanaBank);
				break;
			case "5":
				System.out.println("이체 페이지로 이동하셨습니다.");
				transfer(inputStr,inputInt,hanaBank,woriBank,nhBank);
				break;
			case "6":
				System.out.println("뒤로가기를 하겠습니다.");
				subRun = false;
				break;
			default:
				System.out.println("1~6사이 숫자만 입력됩니다.");
				break;
			}// switch
		} // 계좌관리 while

	}// 부메뉴 메서드

	private static void transfer(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank, AccountDTO[] woriBank,
		AccountDTO[] nhBank) {
	// 이체 메서드 
	System.out.println("---이체---");
	System.out.print("계좌번호를 입력하세요 :");
	String ano = inputStr.next();
	System.out.println("이체할 금액을 입력하세요 :");
	int minusmoney = inputInt.nextInt();
	AccountDTO outmoney = findAccount2(ano, hanaBank,woriBank,nhBank);
						
}//이체메서드 종료

	private static AccountDTO findAccount2(String ano, AccountDTO[] hanaBank, AccountDTO[] woriBank,
			AccountDTO[] nhBank) {
		// TODO Auto-generated method stub
		// 객체를 찾아주고 객체를 deposit으로 리턴하는 메서드
				AccountDTO account2 = null; // 빈객체
				for (int i = 0; i < hanaBank.length; i++) {
					if (hanaBank != null) {
						String dbano = hanaBank[i].getAno();
						if (dbano.equals(ano)) {
							account2 = hanaBank[i];
						break;
						} // 번호 판단 종료
					} // 빈객체가 아닌지 판단 종료
				} // 반복문 종료

				return account2;
			}
	

	private static void withdraw(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		 //출금
		System.out.println("---출금---");
		System.out.print("계좌번호를 입력하세요 :");
		String ano = inputStr.next();
		System.out.print("출금액을 입력하세요 :");
		int minusmoney = inputInt.nextInt();
		AccountDTO inoutAccount = findAccount(ano, hanaBank);
		if (inoutAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다.");
			return;
		}
		inoutAccount.setBalance(inoutAccount.getBalance() - minusmoney);
		System.out.println("입금테스트 결과 :" + inoutAccount);// toString 오버레이드로 결과보기
		System.out.println(inoutAccount.getOwenr() + "님 출금이 성공되었습니다.");
		System.out.println("잔액 :" + inoutAccount.getBalance() + "원");
		System.out.println("==========================================");
	}

	private static void deposit(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		// 예금 메서드
		System.out.println("---예금---");
		System.out.print("계좌번호를 입력하세요 :");
		String ano = inputStr.next();
		System.out.print("예금액을 입력하세요(21억미만) :");
		int money = inputInt.nextInt();
		AccountDTO inputAccount = findAccount(ano, hanaBank); // 배열에서 객체를 찾아주고 객체를 리턴해준다.(반복코드 배제용)
		if (inputAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다.");
			return;
		}
		inputAccount.setBalance(inputAccount.getBalance() + money);
		System.out.println("입금테스트 결과 :" + inputAccount);// toString 오버레이드로 결과보기
		System.out.println(inputAccount.getOwenr() + "님 입금이 성공되었습니다.");
		System.out.println("잔액 :" + inputAccount.getBalance() + "원");
		System.out.println("==========================================");

	}// 계좌 이체 메서드 종료

	private static AccountDTO findAccount(String ano, AccountDTO[] hanaBank) {
		// 객체를 찾아주고 객체를 deposit으로 리턴하는 메서드
		AccountDTO account = null; // 빈객체
		for (int i = 0; i < hanaBank.length; i++) {
			if (hanaBank != null) {
				String dbano = hanaBank[i].getAno();
				if (dbano.equals(ano)) {
					account = hanaBank[i];
				break;
				} // 번호 판단 종료
			} // 빈객체가 아닌지 판단 종료
		} // 반복문 종료

		return account;
	}

	private static void AccountLists(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		// 직원용 계좌목록보기 메서드
		System.out.println("---계좌목록보기---");
		for (int i = 0; i < hanaBank.length; i++) {
			AccountDTO accountlist = hanaBank[i]; // 하나뱅크 배열에 들어있는 것
			if (accountlist != null) { // 배열에 null이 아니면 실행이 됨
				System.out.println(accountlist.getAno());
				System.out.println("\t");

				System.out.println(accountlist.getOwenr());
				System.out.println("\t");

				System.out.println(accountlist.getBalance());
				System.out.println("\t\n");
				System.out.println("---------------------------");

			} 
		} // for문

	}// 계좌목록보기 메서드 종료

	private static void OpenanAccount(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank) {
		// 계좌개설 메서드
		System.out.println("---계좌개설---");
		AccountDTO myAccount = new AccountDTO(); // 계좌정보를 넣을 객체
		System.out.print("계좌번호 :");
		myAccount.setAno(inputStr.next());
		System.out.print("계좌주 :");
		myAccount.setOwenr(inputStr.next());
		System.out.print("초기 입금액 :");
		myAccount.setBalance(inputInt.nextInt()); // int 21억까지 허용
		myAccount.setBankname("하나은행");
		
		for (int i = 0; i < hanaBank.length; i++) {
			if (hanaBank[i] == null) { // (set) ano,owenr,balance에 넣은 값을 배열이 null 일때 실행되는 코드
				
				hanaBank[i] = myAccount;
				System.out.println("계좌개설 :" + hanaBank[i]);
				break;
				
			}  
			
		} // 하나은행 배열을 0번에서 부터 계속돌리는 반복문
		
		System.out.println("계좌개설이 정상적으로 완료되었습니다.");
	}// 계좌개설메서드 종료

}// 클레스
