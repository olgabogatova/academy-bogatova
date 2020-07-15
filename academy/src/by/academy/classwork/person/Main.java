package by.academy.classwork.person;

public class Main {
	public static void main (String [] args) {
		Person one = new Person();
		one.setFullName("Kim");
		one.setAge(25);
		Person two = new Person("Kate", 24);
		
		System.out.println (one.getFullName() + ", " + one.getAge() + "\n" + one.move() + one.talk()) ;
		System.out.println (two.getFullName() + ", " + two.getAge()+ "\n" + two.move() + two.talk()) ;
	
	}
}
