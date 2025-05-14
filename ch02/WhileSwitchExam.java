package ch02;

import java.util.Scanner;

public class WhileSwitchExam {

	public static void main(String[] args) {
		// scanner로 입력 받은 값을 판단하는 swich문 구현
		Scanner in = new Scanner(System.in);
		System.out.println("동물의 이름을 입력하세요");
		String monster = in.nextLine();
		
		WhoIsIt(monster); // 내가 만든 함수에 호랑이 값을 넣는다
		
		
	}//main 메서드 종료

	static void WhoIsIt(String bio) {
		String kind = "미지의 생물" ; //kind 문자열 변수 초기화
		switch (bio) {
		case "호랑이" , "사자","강아지","고양이" -> kind = "포유류";
		// break;
		case "독수리","참새","까마귀","비둘기" -> kind = "조류";
		//break; 
		case"광어","베스","농어","갈치" -> kind = "어류";
		//break;
		default -> System.out.println("어이쿠!!!");
		}
		System.out.printf("%는 %이다.\n",bio,kind);
		}
}
	
		
	

