package ch02;

import java.util.Scanner;

public class SwitchIfExam1 {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		System.out.println("==========");
		System.out.println("a.�л����");
		System.out.println("b.�����԰���");
		System.out.println("c.��������");
		System.out.println("d.���α׷� ����");
		System.out.print("(a~d)>>>");
		char select = input.next().charAt(0);
		
		switch(select) {
		case 'A':
		case 'a':
			System.out.println("�л����� �޴��� �̵��Ͽ����ϴ�. ");
			System.out.println("1. �л����");
			System.out.println("2. �л�����");
			System.out.println("3. �л�����");
			System.out.println("4. �л�����");
			System.out.print("(1~4)>>");
			int subselect = input.nextInt();
		
		}
		
		
		
		
				
				
		
	}

}
