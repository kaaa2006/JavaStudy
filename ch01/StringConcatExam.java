package ch01;

import java.util.Scanner;

public class StringConcatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strval1 = "kim" + 12.9 ;
		System.out.println(strval1);
		
		
		String strval2 = 18.1 + 16.1 + "kim" ;
		System.out.println(strval2);
		
		
		
		String str4 = 3 + 3.0 + "kkk" ;
		System.out.println(str4);
		
		String str5 = "GDF" + 7.4 ;
		String str6 = str5 + "Ư¡" ;
		System.out.println(str5);
		System.out.println(str6);
		
		
		
		
		
		
		
		
						
		String loginid = "kms"; //id��ü����
		String loginpw = "1234" ; //pw��ü����
		
		Scanner input = new Scanner (System.in);
		System.out.print("�α��� id�Է�");
		String id = input.nextLine();
		System.out.println("id��" + id + "�Դϴ�.");
		
		System.out.print("pw�Է�");
		String pw = input.nextLine();
		System.out.println("==������==");
		
		if (loginid.equals(id)&(loginpw.equals(pw))) {
		System.out.println("��ġ");
		System.out.println("�α��� ����");
		}else{
		System.out.println("id,pw �� Ʋ���ϴ�");
		System.out.println("login ����");
		
		
		
		
		}
			
	}

}
