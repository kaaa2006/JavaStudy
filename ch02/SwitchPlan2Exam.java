package ch02;

public class SwitchPlan2Exam {

	public static void main(String[] args) {
		// break ����
		int time = (int)(Math.random()*10)+8 ;
		System.out.println("����ð��� :" + time + ":��");
		
		switch(time) {
		case 9 :
			System.out.println("1���� ���� ���� ������ ����");
		case 10 :
			System.out.println("2���� ���ο� ���� ���� ���");
		case 11 :
			System.out.println("3���� ���ο� ���� ���� ���");
		case 12 :
			System.out.println("4���� ���ο� �������� ����");
		case 13 :
			System.out.println("���� ");
		case 14 :
			System.out.println("5���� ���� ���� ����");
		case 15 :
			System.out.println("6���� ���� ���� �ǽ� ����");
		case 16 :
			System.out.println("7���� ���� ���� �ǽ�");
		case 17 :
			System.out.println("8���� �ǽ� ���� ����꿡 ���");
		default : 
			System.out.println((time) + "�� ���� �ϰ��ð��� �ƴմϴ�. �޽��ϼ���");
		}// switch�� ����
		
		

	}//main �޼��� ����

}//class ����
