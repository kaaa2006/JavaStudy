package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		
		
		String strval1 = "±è¹Î¼®" ; // ±è¹Î¼®ÀÌ¶ó´Â String °´Ã¼ »ý¼º
		String strval2 = "±è¹Î¼®" ; // À§¿Í °°Àº °´Ã¼
		String strval3 = new String("±è¹Î¼®") ; // »õ·Î¿î °´Ã¼ »ý¼º
		 
		
		
		
		System.out.println(strval1 == strval2); // °°Àº ¹øÁöÀÌ´Ù
		 System.out.println(strval1 == strval3); // °°Àº ¹øÁö ¹¯´Â´Ù 
		 
		 
		boolean eq2 = strval1.equals(strval2) ;
		System.out.println("1¹ø°ú 2¹ø equals »ç¿ë °á°ú :" + eq2);
		 
		boolean eq1 = strval1.equals(strval3) ;
		System.out.println("1¹ø, 3¹øÀÇ equals¸Þ¼­µå »ç¿ë °á°ú :" + eq1); // °ªÀÌ °°ÀºÁö ¹¯´Â´Ù 
		
		
		System.out.println("=====================================================================");
		
		
		char C1 = 'A' + 1 ;
		char C2 = 'A' ;
		
		System.out.println("C1 = " + C1);
		System.out.println("C2 = " + C2);
		
		
		System.out.println("======================================================================");
		
		
		String saal1 = "±è¹Î¼®" ;
		String saal2 = "±è¹Î¼®" ;
		String saal3 = new String ("±è¹Î¼®") ;
		
		boolean re1 = saal1.equals(saal3) ;
		System.out.println("1¹ø°ú 3¹ø equals°á°ú :" + re1);
		
		System.out.println(saal1 == saal2);
		
		
		
		
		
		
		
		
		
		
		

	}

}
