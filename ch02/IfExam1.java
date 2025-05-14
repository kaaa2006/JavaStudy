package ch02;

import java.util.Scanner;

public class IfExam1 {

	public static void main(String[] args) {
		// if(조건문){	실행문	}
		//조건문에 true가 처리되면 중괄호 안쪽이 실행된다.
		// 조건문에 false가 처리되면 중괄호 안쪽이 실행되지 않는다.
		
		Scanner input = new Scanner (System.in);
		
				System.out.println("귀하에 성함을 입력하세요!");
				System.out.print(">>>");
		String name = input.next(); //키보드 입력받은 이름을 name 변수에 넣음
		
		
			//키보드로 입력 받을 수 있는 객체를 생성하여 input에 변수에 연결
				System.out.println("귀하에 점수를 입력하세요.");
				System.out.print(">>>");
		int score = input.nextInt(); // 키보드로 입력받는 정수를 score에 넣음
		
		if (score > 0 && score <= 100) { //0보다 크거나 100이하 이면 true
			if (score >= 90) {//스코어 변수에 입력된 값이 90이상인가? 
				System.out.println(name + "님 이 입력하신 점수가 90점 이상입니다.");
				System.out.println("점수 :" + score + ": 등급 (A)");
			} else if (score >= 80) {
				System.out.println(name + "님이 입력하신 점수는 89~80점 입니다.");
				System.out.println("점수 :" + score + "등급 (B)");
			} else if (score >= 70) {
				System.out.println(name + "님이 입력하신 점수는 79~70점 입니다.");
				System.out.println("점수 :" + score + "등급 (C)");
			} else if (score >= 60) {
				System.out.println(name + "님이 입력하신 점수는 69~60점 입니다.");
				System.out.println("점수 :" + score + "등급 (D)");
			} else { // 나머지기 때문에 if 넣지 않음			
				System.out.println(name + "님이 입력하신 점수가 낮아 등급 F로 결정됨");
				System.out.println("점수 :" + score + ": 등급(F)");
			}  // 정상값이 입력 되었을 때 실행문
			}else  {
				System.out.println(name + "님이 입력값을 확인해 주세요");
				System.out.println("현재 입력값은 " + score  + "입니다.");
				
		
		}
				System.out.println("프로그램이 종료 되었습니다.");
	} // main 메서드 종료 -> 변수 input, name, score

} // class 종료 -> 메서드가 사라짐 -> 프로그램 종료
