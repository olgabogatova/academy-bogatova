/*
 *  ���������� ����������� ���������, ������� ����� ��������� ������� ������  �����-������� ������� ����� ����� �����������. � ������ ������ ����� ����
 * ��������� �������, ����� ������ �������������� �� ����� ���� �������. �����  ������� ������ �������������� �� ��� ��������� � ����������. ��������� ������
 * ��������� ������ ���������� � �������, ��������� �� � ������ � ������� ��  �����. ���� ���������� �������������� � ������ (�������). ����������
 * �������������� ���������� � ������, ���������, ������ ��������� ������  (������ ������ ���� ��� ������).
 */

package by.academy.homework.product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
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

		Product[] products = { new Product("Iphone11 ", 2400, 4, 20), new Product(" TV Samsung ", 1900, 2),
				new Product(" PC Lenovo ", 4300, 2), new Sweets("bee", 1200, 2), new Cheese("Cheddar", 3000, 1),
				new Vine("Vino", 6000, 10) };

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
