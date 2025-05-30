package ch04.singleton;

public class Singleton {
//정적 필드
	private static Singleton singleton = new Singleton();
	//객체 1개만 만들어지는 싱글톤 객체 생성
	
	
	
	//정적생성자
	private  Singleton() {
		
	}
	
	
	//정적메서드 
	static Singleton getInstance() {
		return singleton ;
	}
}
