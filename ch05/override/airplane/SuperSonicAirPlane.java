package ch05.override.airplane;

public class SuperSonicAirPlane extends AirPlane {
	//자식클래스 
	public static final int NOMAL = 1; //일반비행
	public static final int SUPERSONIC = 2; //초음속비행
	//상수선언 (final 변하지 않는 값)
	public int flyMode = NOMAL ; //기본 비행 모드는 일반비행= 1
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		} else {
			super.fly(); //부모에서 제공하는 fiy메소드 호출
		}
		
	}
}
