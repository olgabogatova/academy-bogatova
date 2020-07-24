package by.academy.homework.product;

public class Vine  extends Product {

	public Vine(String name, double price, int quantity) {
		super(name, price, quantity);
		this.discount = 35;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}

}