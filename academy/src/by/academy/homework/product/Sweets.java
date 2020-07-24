

package by.academy.homework.product;

class Sweets extends Product {

	public Sweets(String name, double price, int quantity) {
		super(name, price, quantity);
		this.discount = 10;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}

}
