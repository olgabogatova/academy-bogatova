/*
 *  ���������� ����������� ���������, ������� ����� ��������� ������� ������  �����-������� ������� ����� ����� �����������. � ������ ������ ����� ����
 * ��������� �������, ����� ������ �������������� �� ����� ���� �������. �����  ������� ������ �������������� �� ��� ��������� � ����������. ��������� ������
 * ��������� ������ ���������� � �������, ��������� �� � ������ � ������� ��  �����. ���� ���������� �������������� � ������ (�������). ����������
 * �������������� ���������� � ������, ���������, ������ ��������� ������  (������ ������ ���� ��� ������).
 */

package by.academy.homework.product;

public class Main {
	public static void main(String[] args) {

		User seller = new User("Vasya");
		User buyer = new User("Kim");
		Product[] products = { new Product("Iphone11 ", 2400, 4), new Product(" TV Samsung ", 1900, 2),	new Product(" PC Lenovo ", 4300, 2) };

		Deal deal = new Deal(seller, buyer, products);

		System.out.println("Seller name : " + seller.getName() + "\n" + "Buyer name : " + buyer.getName() + "\n" +  "Products : " + deal.list());
		System.out.println("Deal price : " + deal.deal());
	}
}

