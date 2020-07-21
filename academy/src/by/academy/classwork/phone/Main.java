package by.academy.classwork.phone;

public class Main {
	public static void main(String[] args) {
		Phone one = new Phone("123456789", 120, "Iphone");
		Phone two = new Phone("234567891", 234.4, "Xiomi");
		Phone three = new Phone("345678912", 220,"Samsung");
		
	//	System.out.println("Number: " + one.getNumber()+ ", " + "Weight: " + one.getWeight() + ", "+ "Model: " + one.getModel());
	//	System.out.println("Number: " + two.getNumber()+ ", " + "Weight: " + two.getWeight() + ", "+ "Model: " + two.getModel());
	//	System.out.println("Number: " + three.getNumber()+ ", " + "Weight: " + three.getWeight() + ", "+ "Model: " + three.getModel());
		
		
		one.printInfo();
		two.printInfo();
		three.printInfo();
		
		System.out.println(one.receiveCall(null) + "\n" + two.receiveCall(null) + "\n" + three.receiveCall(null));
		
		Phone four = new Phone("456789123", 210);
	//	System.out.println("Number: " + four.getNumber()+ ", " + "Weight: " + four.getWeight() + ", "+ "Model: " + four.getModel());
		four.printInfo();
		
		System.out.println(one.receiveCall(null, null) + "\n" + two.receiveCall(null, null) + "\n" + three.receiveCall(null, null));
		
		System.out.println(one.sendMessage("47888", "56666", "233231"));	
	}
	
}
