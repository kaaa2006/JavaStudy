package ch02;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// switch���� ����� �����ڷ� ����(char)�� ����� �� �� �ִ�.
		
		Scanner inchar = new Scanner(System.in);// char�� ��ĳ�� ��ü�� ����
		
		System.out.print("ȸ�� ����� �Է��ϼ���. (A~C) :");

		//String gradeStr = inchar.next(); //���ڿ��� �����͸� �Է¹޾� String�� ����
		//char gradeChr = gradeStr.charAt(0);//���ڿ� 0�� �ε��� ���ڸ� char Ÿ�� ������ ����
		
		char gradeChaStr = inchar.next().charAt(0);
		
		//System.out.println("�����ڵ��(2��) : "+ gradeChr );
		System.out.println("���� �ڵ��(1��) :" + gradeChaStr);		
		
		switch(gradeChaStr) {
		
		case 'a':
		case 'A':
			System.out.println("���ȸ�� �Դϴ�.");
			break ;
		case 'b':
		case 'B':
			System.out.println("�Ϲ�ȸ�� �Դϴ�.");
			break ;	
		case 'c':
		case 'C':
			System.out.println("�����ȸ�� �Դϴ�.");
			break ;	
		default :
			System.out.println("�մ� ó�� �̽ʴϱ�?");
			System.out.println("ȸ�� ���� �Ͻ÷��� Yes�� �Է����ּ���.");
			String newMember = inchar.next();
			if(newMember.equalsIgnoreCase("yes")) {
			System.out.println("ȸ�������� �����մϴ�.");
			System.out.print("���̵� : ");
			String id = inchar.next();
			System.out.println(id + "�� ȸ�������� ���ϵ帳�ϴ�.");
			break;
			
		}else {
			System.out.println("�ȳ��� ������! ���� ��ȸ�� �˰ڽ��ϴ�.");
			System.out.println("��, �ι� �ٽ� �� �� ���� �־��.");
		} //ȸ������ if�� ����
		
		
		} // switch�� ����
		
		
	}//main �ż��� ����

	}//class ����
