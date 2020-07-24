/*
 * 2. ƒобавить 3 типа продукта, наследоватьс€ от Product, 
 * реализовать метод подсчета цены дл€ каждого продукта.
 *  ƒобавить расчет цены со скидкой. (¬ каждом продукте сво€ скидка).
 */

package by.academy.homework.product;

class Sweets extends Product {

	public Sweets(String name, double price, int quantity) {
		super(name, price, quantity);
		this.discount = 10;
		this.fullPrice();
		this.fullPriceWithDiscount();

	}

}
