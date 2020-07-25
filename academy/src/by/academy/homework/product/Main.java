/*
 *  Необходимо реализовать программу, которая будет позволять вводить сделки  купли-продажи товаров между двумя участниками. В каждой сделке может быть
 * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма  каждого товара рассчитывается из его стоимости и количества. Программа должна
 * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на  экран. Ввод информацию осуществляется с экрана (консоли). Количество
 * дополнительной информацию о сделке, участнике, товаре придумать самому  (больше одного поля для класса).
 */

package by.academy.homework.product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		
//		User seller = new User("Kim", "+375291234567", "Kim@mail.com", "14-02-2020");
//		User buyer = new User("Kit", "+375291234567", "Kim@mail.com", "14-02-2020");
//		
		Scanner sc = new Scanner(System.in);
		User seller = new User();
		System.out.println("Enter seller's name :");
		seller.setName(sc.nextLine());
		System.out.println("Enter seller's phone number :");
		seller.setPhone(sc.nextLine());
		System.out.println("Enter seller's Email :");
		seller.setEmail(sc.nextLine());
		System.out.println("Enter seller's date of birth :");
		seller.setDateOfBirth(sc.nextLine());

		User buyer = new User();
		System.out.println("Enter buyer's name :");
		buyer.setName(sc.nextLine());
		System.out.println("Enter buyer's phone number :");
		buyer.setPhone(sc.nextLine());
		System.out.println("Enter buyer's Email :");
		buyer.setEmail(sc.nextLine());
		System.out.println("Enter buyer's date of birth :");
		buyer.setDateOfBirth(sc.nextLine());

		Product[] products = { new Sweets("Choco", 1200, 2), new Cheese("Cheddar", 3000, 1), new Vine("Vino", 6000, 10) };

		Deal deal = new Deal(seller, buyer, products);

				
		System.out.println("");
		System.out.println("Seller : " + seller.getName() + "\t" + "Phone number : " + seller.getPhone() + "\t"
				+ "Email :" + seller.getEmail() + "\t" + "Date of birth : " + seller.getDateOfBirth() + "\n"
				+ "Buyer  : " + buyer.getName() + "\t" + "Phone number : " + buyer.getPhone() + "\t" + "Email :"
				+ buyer.getEmail() + "\t" + "Date of birth : " + buyer.getDateOfBirth() + "\n" + "Products : "
				+ deal.list());
		System.out.println("Deal price : " + deal.deal() + "\n");
		System.out.println("Deal info : " + "\n" + "Deadline is on : " + deal.getDeadline());

		sc.close();
	}
}
