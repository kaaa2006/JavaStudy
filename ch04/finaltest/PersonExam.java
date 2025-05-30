package ch04.finaltest;

public class PersonExam {

	public static void main(String[] args) {
		Person person = new Person("1234421","kkw");
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
//		person.nation="USA";
//		person.ssn = "12323121"; final 초기값이 이미 선언되어 수정이 불가함
		person.name = "kms"; //name에는 final를 선언하지 않아 수정됨
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
	}

}
