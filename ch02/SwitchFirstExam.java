package ch02;

import java.util.Scanner;

public class SwitchFirstExam {

	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);

        System.out.println("���̸� �Է��ϼ���:");
        int age = input.nextInt();

        System.out.println("���ϴ� ���� ��ȣ�� �����ϼ���:");
        System.out.println("1. �ݶ�");
        System.out.println("2. ���̴�");
        System.out.println("3. Ŀ��");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("�ݶ� �����ϼ̽��ϴ�.");
                break;
            case 2:
                System.out.println("���̴ٸ� �����ϼ̽��ϴ�.");
                break;
            case 3:
                // ���� ���� ���� üũ
                if (age >= 19) {
                    System.out.println("Ŀ�Ǹ� �����ϼ̽��ϴ�.");
                } else {
                    System.out.println("19�� �̸��� Ŀ�Ǹ� ������ �� �����ϴ�.");
                }
                break;
            default:
                System.out.println("�߸��� �����Դϴ�.");
        }

       
    }
}