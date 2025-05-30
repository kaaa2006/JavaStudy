package ch05.override.computer;

public class ComputerExam {

	public static void main(String[] args) {
		int r = 10 ; //10값을 실수로 전달
		
		Calculator cal = new Calculator(); //3.14159값으로 계산
		System.out.println("원면적 :" + cal.areaCircles(r));
		System.out.println(); //부모객체에 대한 원면적 계산값
		
	}

}
