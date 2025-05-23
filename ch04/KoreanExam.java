package ch04;

public class KoreanExam {

	public static void main(String[] args) {
		//  메인으로 다른 클래스 객체 불러오기 
		Korean k1= new Korean ("kms","012345-3123456");
		System.out.println("k1 :" +k1.nation);
		System.out.println("k1 :" +k1.name);
		System.out.println("k1 :" +k1.ssn);
		Korean2 k2 = new Korean2 ("ms","112345-4123456");
		System.out.println("k2 :" +k2.nation);
		System.out.println("k2 :" +k2.name);
		System.out.println("k2 :" +k2.ssn);
	}

}
