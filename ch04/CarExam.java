package ch04;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 메인 실행 프로그램
		Scanner input = new Scanner(System.in);
		boolean run = true;

		System.out.println("===차량정보 입력 ===");
		Car myCar = new Car(); // 기본생성자로 객체 생성
		// 생성시 속도와 rpm과 oil량은 기본값으로 생성
		System.out.print("제조 회사 :");
		myCar.company = input.next();
		
		System.out.print("모델 :");
		myCar.model = input.next();
		
		System.out.print("색상 :");
		myCar.color = input.next();

		while (run) {
			System.out.println("1. 차량 정보 확인");
			System.out.println("2. 차량 시동 걸기");
			System.out.println("3. 차량 주행 시작");
			System.out.println("4. 차량 시동 종료");
			System.out.print(">>>");
			String select = input.next();
			switch (select) {
			case "1":
				System.out.println("차량제조사" + myCar.company);
				System.out.println("모델명" + myCar.model);
				System.out.println("색상" + myCar.color);
				break;
			case "2":
				System.out.println("차량에 시동이 걸렸습니다.");
				myCar.start();
				break;
			case "3":
				myCar.go(input, run);
			case "4":
			myCar.end(run);
			run = false;
			}// 스위치문

		} // 와일문

	}// 메인메서드

}// 클래스
