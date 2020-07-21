package by.academy.classwork.phone;

import java.util.Arrays;

public class Phone {

	private String number;
	private double weight;
	private String model;

	public Phone(String number, double weight, String model) {
		super();
		this.number = number;
		this.weight = weight;
		this.model = model;
	}

	public Phone(String number, double weight) {
		this(number, weight, null);
	}

	public Phone(String number, String model) {
		super();
		this.number = number;
		this.model = model;
	}

	public Phone() {
		super();

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String receiveCall(String name) {
		return "Calls:" + name;
	}

	public String receiveCall(String name, String number) {
		return "Calls:" + name + ", " + "Number:" + number;
	}

	public String sendMessage(String... numbers) {
		return Arrays.toString(numbers);
	}

	public void printInfo() {
		System.out.println("Number: " + number+ ", " + "Weight: " + weight + ", "+ "Model: " + model);
	}
}
