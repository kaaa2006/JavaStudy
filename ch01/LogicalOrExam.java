package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {
		// Ű����� �Է¹��� ���ڰ� 2�� ����̰ų� 3�� ��� �ΰ��� ó���غ���.
				Scanner input = new Scanner (System.in);
				System.out.println("2�� ����� 3�� ����� ���� Ȯ���غ����?");
				System.out.print(">>>");
				int value = input.nextInt();
				if ((value%2==0) || (value%3==0)) {
					//�Է°��� 2�� ���� �������� 0�̸� true
					//			�̰ų�
					//		3�� ���� �������� 0�̸� true
					
					System.out.println("2�� ��� �Ǵ� 3�� ��� �Դϴ�. :" + value);
				}else {
					System.out.println("2�� ��� �Ǵ� 3�� ����� �ƴմϴ� :" + value);
				
	}

	}
	}
