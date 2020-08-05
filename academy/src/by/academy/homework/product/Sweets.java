

package by.academy.homework.product;

class Sweets extends Product {

	public Sweets(String name, double price, int quantity) {
		super(name, price, quantity);
		this.discount = 10;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}
	
	public Sweets(String name, double price, int quantity, int discount) {
		super(name, price, quantity, discount);
		this.discount = 10;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}
	
	public Sweets(String name) {
		super(name);
		this.setPrice(1200);
		this.discount = 10;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}
	
	public Sweets() {
		super();
	}

}
