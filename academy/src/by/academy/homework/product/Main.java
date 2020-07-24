/*
 *  Необходимо реализовать программу, которая будет позволять вводить сделки  купли-продажи товаров между двумя участниками. В каждой сделке может быть
 * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма  каждого товара рассчитывается из его стоимости и количества. Программа должна
 * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на  экран. Ввод информацию осуществляется с экрана (консоли). Количество
 * дополнительной информацию о сделке, участнике, товаре придумать самому  (больше одного поля для класса).
 */

package by.academy.homework.product;

public class Main {
	public static void main(String[] args) {

		User seller = new User("Vasya");
		User buyer = new User("Kim");
		Product[] products = { new Product("Iphone11 ", 2400, 4, 20), new Product(" TV Samsung ", 1900, 2),
				new Product(" PC Lenovo ", 4300, 2), new Sweets("bee", 1200, 2) , new Cheese ("Cheddar", 3000,1), new Vine("Vino", 6000,10)};

		Deal deal = new Deal(seller, buyer, products);

		System.out.println("Seller name : " + seller.getName() + "\n" + "Buyer name : " + buyer.getName() + "\n"
				+ "Products : " + deal.list());
		System.out.println("Deal price : " + deal.deal() + "\n");
	}
}
