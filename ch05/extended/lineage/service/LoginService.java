package ch05.extended.lineage.service;

import java.util.Scanner;

import ch05.extended.lineage.DTO.Account;

public class LoginService {

	public static Account menu(Scanner scanner, Account[] accounts, Account loginAccount) {
		// 로그인에 관한 부메뉴용
		System.out.println("|1.로그인|2.회원가입|3.회원수정|4뒤로가기|");
		System.out.println(">>>");
		int select = scanner.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("로그인을 시작합니다.");
			System.out.print("id :");
			String id = scanner.next();
			System.out.print("pw :");
			String pw = scanner.next();
			Account account = new Account();
			account.setId(id);
			account.setPw(pw); //새로만든 account 객체에 id,pw 삽입
			
			//배열에 있는 값과 비교
			for(int i=0;i<accounts.length; i++) {
				if(accounts[i] != null) {
					if(accounts[i].getId().equals(account.getId())) {
						System.out.println("해당하는 id가 있습니다.");
						if(accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 pw가 있습니다.");
							loginAccount = accounts[i];
							System.out.println("로그인 성공");
							break;
						}else {
							System.out.println("해당하는 pw가 없습니다.");
						}
					}System.out.println("해당하는 id가 없습니다.");
				}else {
					System.out.println("해당하는 정보가 없습니다");
					break;
				}
			}//for
		}//switch
		
		
		
		return loginAccount;
	}//main
	
}
