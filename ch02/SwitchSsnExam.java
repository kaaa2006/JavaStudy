package ch02;

import java.util.Scanner;

public class SwitchSsnExam {

	public static void main(String[] args) {
		// charAt����ؼ� �ֹι�ȣ ���౸��
		
		System.out.print("����� �ֹι�ȣ�� �Է��Ͻÿ�(010101-1234567)>");
		Scanner in = new Scanner(System.in);
		String regno = in.nextLine();
		char gender = regno.charAt(7); //8��° ���ڸ� ����
		
		System.out.println(gender);
		
		switch(gender) {
		case'1' : case'3' : case'5' : case'7': 
			System.out.println("����� ���� �Դϴ�.");
			break;
		case'2' : case'4' : case'6' : case'8': 
			System.out.println("����� ���� �Դϴ�.");
			break;
		default :
			System.out.println("����� �ֹι�ȣ�� �߸� �Է� �Ǿ����ϴ�");
			System.out.println("�ٽ� �Է����ּ���.");
		}

	}

}
