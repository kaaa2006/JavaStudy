package ch05.extended.school;

public class Person {
	private String name;
	private int height;
	private int weight;
	private int age;

	// 게터 세터 생성
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int height, int weight, int age) {
		super(); // 부모생성자의 객체 생성용
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
}
