package ch02;

import java.util.Scanner;

public class SwitchIfExam {

	public static void main(String[] args) {
		// if ����ؼ� �α���, ȸ������ ������
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("ȯ���մϴ�.");
		System.out.println("a. ȸ������,�α���");
		System.out.println("b. ==");
		System.out.print("(a~b)>>>");
		char select = input.next().charAt(0);
		
		switch(select) {
		case 'A' :
		case 'a' :	
			System.out.println("ȸ������ ȭ������ �̵��ϼ̽��ϴ�");
			System.out.println("1.ȸ������ �ϱ�");
			System.out.println("2.�α��� �ϱ�");
			System.out.print("(1~2)>>");
			int subselect = input.nextInt();
			switch(subselect) {
			case 1 :
				System.out.println("ȸ������ �ϱ�");
				
				break;
			case 2 :
				System.out.println("�α��� �ϱ�");
			}
			
			
						
		}
			
			
		}
		
		
		
	

	}


