package ch01;

public class OperaitinExam {

	public static void main(String[] args) {
		// �����ڴ� ���α׷����� �����͸� ó���Ϸ� ����� ������.
		// �����ڴ� +,-,*,/,% (4Ģ ������ + ������ ���)
		
		
		int od= 15 ;
		int y = od % 2 ;
		String resultod = (y == 1)? "Ȧ��":"¦��" ;
		 System.out.println("15�� ¦�� ���:" + resultod );
		
		 
		 
		 
		int x = 12 ;
		int y2 = x % 2 ;
		String resulty2 = (y2==0)? "2�� ����̴�":"�ƴϴ�" ;
		System.out.println("2�� ��� �Ǵܰ�� :" +resulty2 );
		
		
	}

}
