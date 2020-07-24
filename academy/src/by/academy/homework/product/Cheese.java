package by.academy.homework.product;

public class Cheese extends Product {

	public Cheese(String name, double price, int quantity) {
		super(name, price, quantity);
		this.discount = 5;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}

}