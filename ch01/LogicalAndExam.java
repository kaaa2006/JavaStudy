package ch01;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �Է½� �빮�ڳ� ���ڸ� �����մϴ�");
		int charCode = input.nextInt();
		
		if((charCode>=65) &(charCode<=90)) {
		System.out.println("�Է°��� �빮�� �Դϴ�. :" +((char)charCode)) ;
		
		}
		
		
			
	}

}
