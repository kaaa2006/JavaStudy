package ch01;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 입력시 대문자나 숫자를 구분합니다");
		int charCode = input.nextInt();
		
		if((charCode>=65) &(charCode<=90)) {
		System.out.println("입력값은 대문자 입니다. :" +((char)charCode)) ;
		
		}
		
		
			
	}

}
