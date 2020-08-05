package by.academy.homework.product;

public class Cheese extends Product {

	public Cheese(String name, double price, int quantity) {
		super(name, price, quantity);
		this.discount = 5;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}

	public Cheese(String name) {
		super(name);
		this.discount = 5;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}
	
	public Cheese(String name, double price, int quantity, int discount) {
		super(name, price, quantity, discount);
		this.discount = 5;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}
	
	public Cheese() {
		super();
	}

}