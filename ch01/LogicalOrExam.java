package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 숫자가 2의 배수이거나 3의 배수 인것을 처리해보자.
				Scanner input = new Scanner (System.in);
				System.out.println("2의 배수나 3의 배수인 것을 확인해볼까요?");
				System.out.print(">>>");
				int value = input.nextInt();
				if ((value%2==0) || (value%3==0)) {
					//입력값을 2로 나눈 나머지가 0이면 true
					//			이거나
					//		3로 나눈 나머지가 0이면 true
					
					System.out.println("2의 배수 또는 3의 배수 입니다. :" + value);
				}else {
					System.out.println("2의 배수 또는 3의 배수가 아닙니다 :" + value);
				
	}

	}
	}
