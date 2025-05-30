package ch05.extended.school;

public class Student extends Person {


private String stID; //학번
private int grade; //학년
private int gpa; //학점
	
	
//생성자	
public String getStID() {
	return stID;
}


public int getGrade() {
	return grade;
}


public int getGpa() {
	return gpa;
}


public void setStID(String stID) {
	this.stID = stID;
}


public void setGrade(int grade) {
	this.grade = grade;
}


public void setGpa(int gpa) {
	this.gpa = gpa;
}
public Student(String name, int height, int weight, int age) {
	super(name, height, weight, age);
	this.stID = stID;
	this.grade = grade;
	this.gpa = gpa;
}
	public void show () {
		System.out.println("학생 이름 :" + getName());
		System.out.println("학생 닝; :" + getAge());
		System.out.println("학생  키 :" + getHeight());
		System.out.println("학생 몸무게 :" + getWeight());
		System.out.println("--------------------------");
		System.out.println("학생 이름 :" + getStID());
		System.out.println("학생 학년 :" + getGrade());
		System.out.println("학생 학점 :" + getGpa());
	}

}
	
	
	
	
	
	
	
	
	
	

	

