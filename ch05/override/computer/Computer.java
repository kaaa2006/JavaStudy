package ch05.override.computer;

public class Computer extends Calculator{

	@Override
	double areaCircles(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return super.areaCircles(r);
	} //메서드 오버라이딩 진행

}
