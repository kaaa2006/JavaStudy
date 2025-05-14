package ch02;

import java.util.Scanner;

public class SwitchSsnExam {

	public static void main(String[] args) {
		// charAt사용해서 주민번호 남녀구분
		
		System.out.print("당신의 주민번호를 입력하시오(010101-1234567)>");
		Scanner in = new Scanner(System.in);
		String regno = in.nextLine();
		char gender = regno.charAt(7); //8번째 글자를 추출
		
		System.out.println(gender);
		
		switch(gender) {
		case'1' : case'3' : case'5' : case'7': 
			System.out.println("당신은 남자 입니다.");
			break;
		case'2' : case'4' : case'6' : case'8': 
			System.out.println("당신은 여자 입니다.");
			break;
		default :
			System.out.println("당신의 주민번호는 잘못 입력 되었습니다");
			System.out.println("다시 입력해주세요.");
		}

	}

}
