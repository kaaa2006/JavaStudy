package ch04;

import java.util.Scanner;

import javax.print.attribute.standard.JobHoldUntil;

public class Car {
	// 필드 (객체가 가지고 있어야 하는 값) -> 글로벌 변수라고도 함(GV)
	// 고유 데이터
	public String company; // 회사
	public String model; // 모델
	public String color; // 색상
	public int maxSpeed; // 최고출력
	public String oilType; // 경우,휘발류
	public int minSpeed;
	public int oilMaximum;
	// 상태값(변동가능)
	public int speed;
	public int rpm;
	public int oil;

	// 부품 -> 다른 클래스를 생성하여 연결한다.
	// public Body body;
	// public Engine engine;
	// public Tire tire;
	// 부품에 필드 사용법
	// Car myCar = new Car(); -> 객체 생성(인스턴스)
	// myCar.maxSpeed = 300 ; -> 객체 있는 maxSpeed에 300 정수를 넣는다.
	// -------------------------------------------------------------------------------
	// 기본생성자: 생략이 가능하다 (객체가 생성할때 사용되는 메서드 : 클래스 명과 같은 이름)
	public Car() {
		speed = 0;
		rpm = 50;
		oil = 100;
		maxSpeed = 200;
		oilMaximum = 300;
	}// 객체가 생성 되면서 변수에 값이 저장됨.

	// 사용자 지정 생성자-> 개발자가 응용하는 기법
	// 사용자 지정 생성자가 만들어 지면 기본생성자는 자동으로 생성되지 않는다.
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}// Car myCar = new car("벤츠","E클래스","빨강")

	// 메서드 (객체가 수행해야 되는 동작)
	// C(시동) R(차량상태, 주행상태) U(가속, 감속, 주차) D (시동종료)
	public void start() {
		System.out.println(this.model + "가(이) 시동을 켰습니다.  ");
		System.out.println("현재 속도:" + this.speed);
		System.out.println("현재 rpm:" + this.rpm);
		System.out.println("현재 주유량:" + this.oil);

	}// myCar.start

	public void go(Scanner input, boolean run) {
		while(run) {
			System.out.println("1.가속하기");
			System.out.println("2.브레이크");
			System.out.println("3.주유하기");
			System.out.println("4.뒤로가기");
			System.out.print("1~4 숫자 입력>>>");
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("가속");
				speed += 30;
				oil -= 10;
				if (speed >= maxSpeed && oil <= oil ) {
					speed = maxSpeed;
				}//가속 if
				System.out.println("현재속도" + this.speed + "km/h");
				System.out.println("현재 남은 기름:" + oil);
				break;
			case 2:
				System.out.println("감속");
				speed -= 10;
				if(speed <= minSpeed) {
					speed=minSpeed;
				}//감속if
				System.out.println("현재속도" + this.speed + "km/h");
				break;
			case 3:
				System.out.println("주유하기");
				oil += 15;
				if(oil >= oilMaximum) {
					oil = oilMaximum;
				}
				System.out.println("주유중 기름량:" + this.oil);
				break;
				
			case 4:
				System.out.println("처음화면으로 갑니다");
				run = false;
			default:
					System.out.println("1~4에 숫자만 입력이 가능합니다.");
			}//차량주행 시작 switch문
			
		}
	}

	public void end(boolean run) {
		// TODO Auto-generated method stub
		
		
		System.out.println("주행을 종료합니다.");
		System.out.println("시동을 종료했습니다");
		
	}
}
