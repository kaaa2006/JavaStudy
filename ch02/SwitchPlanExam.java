package ch02;

public class SwitchPlanExam {

	public static void main(String[] args) {
		// break �� ���� 
		int time = (int)(Math.random()*6)+6 ;
		System.out.println("���� �ð��� :" + time + "��");
		
		switch(time) {
		case 6:
			System.out.println("������ �ϰ� �п� �� �غ� �մϴ�.");
		case 7:
			System.out.println("������ Ÿ�� �п��� ���ϴ�.");
		case 9:
			System.out.println("�п� ������ ���� �غ� �մϴ�.");
		case 10:
			System.out.println("������ ��� �����մϴ�.");
		default :
			System.out.println("������ ������ ����ϴ�.");
						
		}// switch�� ����

	}// main �޼��� ����

}// class ����
