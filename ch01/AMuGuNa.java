package ch01;

import java.util.Scanner;

public class AMuGuNa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10 ;
		int y = x % 2 ;
		String resultx = (y==1)? "Ȧ��":"¦��" ;
		System.out.println("10�� Ȧ¦ ����:" + resultx );
		
		
		
		
		int x1 = 12 ;
		int y2 = x % 2 ;
		String resulty2 = (y2==0)? "4�� ���" :"����" ;
		System.out.println("16�� 4�� ����ΰ�:" + resulty2);
		
		
		
		
		
		
		
		int x2 = 12 ;
		int y3 = x % 2 ;
		String resulty3 = (y3==0)? "2�� ����̴�":"�ƴϴ�" ;
		System.out.println("2�� ��� �Ǵܰ�� :" +resulty3 );
		System.out.println("==============================================================================================================");
		
		String loginid ="kaaa1877" ;
		String loginpw ="siki8400" ;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("id�� �Է��ϼ���.");
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� id��" + id + "�Դϴ�.");
		
		System.out.println("pw�� �Է��ϼ���.");
		String pw = input.nextLine();
		System.out.println("===������===");
		
		if((loginid.equals(id)) & (loginpw.equals(pw))) {
			System.out.println("id pw�� ��ġ�մϴ�.");
			System.out.println("�α��� ����");
		}else{
		System.out.println("id�� pw�� Ʋ���ϴ�.");
		System.out.println("�α��� ����");
			
		
		
		}
			
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
