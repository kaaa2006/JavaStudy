package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		
		
		String strval1 = "��μ�" ; // ��μ��̶�� String ��ü ����
		String strval2 = "��μ�" ; // ���� ���� ��ü
		String strval3 = new String("��μ�") ; // ���ο� ��ü ����
		 
		
		
		
		System.out.println(strval1 == strval2); // ���� �����̴�
		 System.out.println(strval1 == strval3); // ���� ���� ���´� 
		 
		 
		boolean eq2 = strval1.equals(strval2) ;
		System.out.println("1���� 2�� equals ��� ��� :" + eq2);
		 
		boolean eq1 = strval1.equals(strval3) ;
		System.out.println("1��, 3���� equals�޼��� ��� ��� :" + eq1); // ���� ������ ���´� 
		
		
		System.out.println("=====================================================================");
		
		
		char C1 = 'A' + 1 ;
		char C2 = 'A' ;
		
		System.out.println("C1 = " + C1);
		System.out.println("C2 = " + C2);
		
		
		System.out.println("======================================================================");
		
		
		String saal1 = "��μ�" ;
		String saal2 = "��μ�" ;
		String saal3 = new String ("��μ�") ;
		
		boolean re1 = saal1.equals(saal3) ;
		System.out.println("1���� 3�� equals��� :" + re1);
		
		System.out.println(saal1 == saal2);
		
		
		
		
		
		
		
		
		
		
		

	}

}
