package ch04.finaltest;

public class Person {
//필드
	public final String nation = "Korea";
	public final String ssn; //초기값 없이 생성자에 넣음
	public String name;
	
	
//생성자
	public Person(String ssn,String name) {
	this.ssn = ssn;
	this.name =name;
}
}