package ch05.override.airplane;

public class SuperSonicExam {

	public static void main(String[] args) {
	SuperSonicAirPlane sa = new SuperSonicAirPlane();
	sa.takeOff();//이륙합니다
	sa.fly();//일반비행합니다
	sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
	//SuperSonic 모드로 변경
	sa.fly();//초음속비행합니다
	sa.flyMode = SuperSonicAirPlane.NOMAL;
	sa.fly();//일반비행합니다
	sa.land(); //착륙합니다
			
	}

}
