package ch02;

public class SwitchPlan2Exam {

	public static void main(String[] args) {
		// break 생략
		int time = (int)(Math.random()*10)+8 ;
		System.out.println("현재시각은 :" + time + ":시");
		
		switch(time) {
		case 9 :
			System.out.println("1교시 어제 들은 수업을 복습");
		case 10 :
			System.out.println("2교시 새로운 수업 내용 듣기");
		case 11 :
			System.out.println("3교시 새로운 수업 내용 듣기");
		case 12 :
			System.out.println("4교시 새로운 수업내용 응용");
		case 13 :
			System.out.println("점심 ");
		case 14 :
			System.out.println("5교시 오후 수업 시작");
		case 15 :
			System.out.println("6교시 오후 수업 실습 진행");
		case 16 :
			System.out.println("7교시 오후 응용 실습");
		case 17 :
			System.out.println("8교시 실습 내용 깃허브에 백업");
		default : 
			System.out.println((time) + "시 현재 일과시간이 아닙니다. 휴식하세요");
		}// switch문 종료
		
		

	}//main 메서드 종료

}//class 종료
