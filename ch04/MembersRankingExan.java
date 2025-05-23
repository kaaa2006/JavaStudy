package ch04;

import java.util.Scanner;

public class MembersRankingExan {

	public static void main(String[] args) {
		// 회원등급을 객체를 불러 만들어보자 
		Scanner input = new Scanner(System.in);
		String[] names = null;
		String[] ids = null;
		String[] pws = null;
		Ranking[] membersRankings = null;
		
		System.out.println("몇명의 회원을 등록 하시겠습니까?");
				System.out.print(">>>");
				int count = input.nextInt();
				names = new String[count];
				ids = new String[count];
				pws = new String[count];
				membersRankings = new Ranking[count];
				
				System.out.println("회원가입을 시작합니다.");
				for(int i=0; i<names.length;i++) {
					System.out.print("이름>>>");
					names[i] = input.next();
					System.out.print("id>>>");
					ids[i] = input.next();
					System.out.print("pw>>>");
					pws[i] = input.next();
					
				System.out.println("등급을 선택하세요");
				System.out.println("1. GUEST");
				System.out.println("2. MEMBER");
				System.out.println("3. VIP");
				System.out.println("4. VVIP");
				System.out.println("5. VVVIP");
				String membersRanking = input.next();
				
				switch(membersRanking) {
				case "1":
					membersRankings[i] = Ranking.GUEST;
					System.out.println("손님의 듭등입니다");
					break;
				case  "2": 
					membersRankings[i] = Ranking.MEMBER;
					System.out.println("손님의 등급입니다");
					break;
				case "3" : 
					membersRankings[i] = Ranking.VIP;
					System.out.println("손님의 등급입니다");
					break;
				case "4" : 
					membersRankings[i] = Ranking.VVIP;
					System.out.println("손님의 등급입니다");
					break;
				}
					
					
					
					
				}

	}

}
