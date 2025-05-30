package ch05.casting;

public class ChildExam {

	public static void main(String[] args) {
	Parent parent = new Child(); //자동타입 변환으로 자식객체를 통해 부모 객체도 생성한다.
	
	parent.field1 = "kms";
	parent.method1(); //부모클래스 메서드
	parent.method2(); //
//	parent.method23();//자식클래스의 메서드 
//	parent.field2 = "kms"; //자식클래스의 필드
	
	Child child = new Child ();
	child.method3(); //자식클래스의 메서드
	child.field2 = "kms"; //자식클래스의 필드
	
	Child ch = (Child) parent; //강제타입변환
	ch.method3(); //자식클래스 메서드
	ch.field2 = "kms"; //자식클래스의 필드
	
			

	}

}
