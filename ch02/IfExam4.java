package ch02;

import java.util.Scanner;

public class IfExam4 {

	public static void main(String[] args) {
		// �ֹι�ȣ ���� ����
		System.out.println("�ֹι�ȣ�� �Է��ϼ���(-����)");
		Scanner in = new Scanner(System.in);
		
		String ssn = in.next();
		
		char ssn2 = ssn.charAt(6);
		int num = Character.getNumericValue(ssn2);
				
		if(num % 2 ==0) {
			System.out.println("����");
		} else if (num % 2 == 1) {	
			System.out.println("����");
		} else {
			System.out.println("�ٽ� �ۼ����ּ���.");
			
		}// ���� ���� if�� ����
		int year = Integer.parseInt(ssn.substring(0,2));
		if(num ==1 || num==2 || num ==5 || num==6) {
			System.out.println("���̴�" + (2023-(1900+ year)+1)+"�Դϴ�");
		}else if (num==3 || num ==4 || num==7||num==8) {
			System.out.println("���̴�"+(2023-(2000+year)+1)+"�Դϴ�.");
		}
		
	}

}
