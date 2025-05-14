package ch02;

public class SwitchPlanExam {

	public static void main(String[] args) {
		// break 를 생략 
		int time = (int)(Math.random()*6)+6 ;
		System.out.println("현재 시각은 :" + time + "시");
		
		switch(time) {
		case 6:
			System.out.println("샤워를 하고 학원 갈 준비를 합니다.");
		case 7:
			System.out.println("버스를 타고 학원을 갑니다.");
		case 9:
			System.out.println("학원 도차후 수업 준비를 합니다.");
		case 10:
			System.out.println("수업을 듣기 시작합니다.");
		default :
			System.out.println("수업을 열심히 듣습니다.");
						
		}// switch문 종료

	}// main 메서드 종료

}// class 종료
