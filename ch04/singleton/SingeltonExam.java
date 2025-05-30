package ch04.singleton;

public class SingeltonExam {

	public static void main(String[] args) {
		//Singleton obj1 = new Singelton();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		
		System.out.println("obj2,3은 같은가?" +( obj2 == obj3) );
		
	}

}
