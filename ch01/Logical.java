package ch01;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// //������ �����ڴ� ũ�� 5���� ������ �ִ�.
		// & : �� �� -> ~�̰� (2���� ������ ��� ���ϰ�� ��)
		// | : �� �� -> ~�̰ų� (2������ �Ѱ��� ���̸� ��)
		// ! : ������ -> ���� ������ ���� ��
		// ^ : ��Ÿ�� �� �� -> ������ �������� 1 + 1 = 0 ���� ��г�
		
		String loginid= "kms" ;
		String loginpw= "1234" ;
		
		Scanner input = new Scanner (System.in) ;
		
		System.out.print("id �Է�");
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� id�� :" + id +"�Դϴ�.");
		
		System.out.print("��ȣ�� �Է��ϼ���.");
		String pw = input.nextLine();
		System.out.println("==������==");
		
		if((loginid.equals(id)) & (loginpw.equals(pw))) {
		
		System.out.println("id pw ��ġ");
		System.out.println("����");
		
		}else {
			System.out.println("id�� pw�� Ʋ���ϴ�.");
			System.out.println("�α��� ����");
			
		}
		
		
		
		 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
