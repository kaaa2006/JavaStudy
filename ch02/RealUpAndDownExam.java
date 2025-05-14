package ch02;

import java.util.Scanner;

public class RealUpAndDownExam {

	public static void main(String[] args) {
		// 업엔다운 게임 만들기
		// 컴퓨터가 랜덤 숫자를 생성한다.(1~50)
		// 사용자가 숫자를 입력한다.
		// 컴퓨터가 랜덤숫자를 판단하여 up / down을 알려준다.
		// 사용자의 숫자와 컴퓨터의 랜덤숫자가 일치하면 프로그램 종료와 함께 당첨 사실을 알린다.
		// 3번 안에 성공시 상품 증정용 코드 추가 

		int answer = (int)(Math.random()*50)+1;
		//컴퓨터가 랜덤 숫자를 생성한다. (1~50)
		Scanner input = new Scanner(System.in);
		//키보드로 입력받는 객체 생성
		int question = 0 ;//사용자가 입력하는 숫자 보관용
		int hits = 0; //카운트용
		
		System.out.println("================");
		System.out.println("업&다운 게임에 오신 걸 환영합니다");
		System.out.println("3번 안에 맞추시면 상품을 제공 합니다.");
		System.out.println("======================");
		
		do {
			System.out.println("1부터 50사이의 숫자를 입력하세요.");
			question = input.nextInt(); // 사용자가 숫잘를 키보드로 입력한다
			hits ++ ; //키보드로 입력한 횟수만큼 카운트 용
			System.out.println("down");
		 
		if(question>answer) { //사람이 쓴 숫자가 크니 답은 아래	
		System.out.println("down");
		
		} else if(question < answer ) { //사람이 쓴 숫자가 작으니 위쪽
			System.out.println("up");
		}	
		} while (question != answer ); // do while 문 종료
		// 랜덤 숫자와 사용자가 입력한 숫자가 같지 않으면 do 문으로 올라감.
		  // 랜덤 숫자와 사용자가 입력한 숫자가 같으면 아래로 내려옴.
		
		System.out.println("정답입니다."+answer);
		System.out.println("고객님이 맞춘 횟구는 :" +hits+"번 입니다");
		
		if(hits <=3) {
			System.out.println("상품수령: 관리자가 연락을 기다립니다");
			
		}else { 
			System.out.println("상품수령 실패");
		}
		
}//main 메서드 종료
}//class 종료