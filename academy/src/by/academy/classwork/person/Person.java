package by.academy.classwork.person;

public class Person {
	private String fullName;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String move() {
		return "The Person moves.";
	}
	
	public String talk() {
		return "The Person talks.";
	}
	
}
