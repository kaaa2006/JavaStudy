package ch02;

import java.util.Scanner;

public class IfExam1 {

	public static void main(String[] args) {
		// if(���ǹ�){	���๮	}
		//���ǹ��� true�� ó���Ǹ� �߰�ȣ ������ ����ȴ�.
		// ���ǹ��� false�� ó���Ǹ� �߰�ȣ ������ ������� �ʴ´�.
		
		Scanner input = new Scanner (System.in);
		
				System.out.println("���Ͽ� ������ �Է��ϼ���!");
				System.out.print(">>>");
		String name = input.next(); //Ű���� �Է¹��� �̸��� name ������ ����
		
		
			//Ű����� �Է� ���� �� �ִ� ��ü�� �����Ͽ� input�� ������ ����
				System.out.println("���Ͽ� ������ �Է��ϼ���.");
				System.out.print(">>>");
		int score = input.nextInt(); // Ű����� �Է¹޴� ������ score�� ����
		
		if (score > 0 && score <= 100) { //0���� ũ�ų� 100���� �̸� true
			if (score >= 90) {//���ھ� ������ �Էµ� ���� 90�̻��ΰ�? 
				System.out.println(name + "�� �� �Է��Ͻ� ������ 90�� �̻��Դϴ�.");
				System.out.println("���� :" + score + ": ��� (A)");
			} else if (score >= 80) {
				System.out.println(name + "���� �Է��Ͻ� ������ 89~80�� �Դϴ�.");
				System.out.println("���� :" + score + "��� (B)");
			} else if (score >= 70) {
				System.out.println(name + "���� �Է��Ͻ� ������ 79~70�� �Դϴ�.");
				System.out.println("���� :" + score + "��� (C)");
			} else if (score >= 60) {
				System.out.println(name + "���� �Է��Ͻ� ������ 69~60�� �Դϴ�.");
				System.out.println("���� :" + score + "��� (D)");
			} else { // �������� ������ if ���� ����			
				System.out.println(name + "���� �Է��Ͻ� ������ ���� ��� F�� ������");
				System.out.println("���� :" + score + ": ���(F)");
			}  // ������ �Է� �Ǿ��� �� ���๮
			}else  {
				System.out.println(name + "���� �Է°��� Ȯ���� �ּ���");
				System.out.println("���� �Է°��� " + score  + "�Դϴ�.");
				
		
		}
				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	} // main �޼��� ���� -> ���� input, name, score

} // class ���� -> �޼��尡 ����� -> ���α׷� ����
