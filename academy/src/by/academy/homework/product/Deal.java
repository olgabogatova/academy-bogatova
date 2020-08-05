package by.academy.homework.product;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.Scanner;

public class Deal {

	private User seller;
	private User buyer;
	private ArrayList<Product> products;
	private Date deadline;

	Scanner sc = new Scanner(System.in);

	public Deal() {
		super();
		init();

	}

	public Deal(User seller, User buyer, ArrayList<Product> products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		init();

	}

	private void init() {
		Calendar c = new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, 10);
		this.deadline = c.getTime();
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	
	
	public double dealEdit() {
		double d = 0;
		for (Product p : products) {
			d += (p.getPrice() * p.getQuantity()) - (p.getPrice() * p.getQuantity() * p.getDiscount() / 100);
		}
		ArrayList<Product> al = products;

		System.out.println(
				"If you want to add or delete a product write \"Add\" or \"Delete\" . If not - write \"End\" ");
		String s = sc.nextLine();

		switch (s) {
		case "Add":

			System.out.println(
					"Choose a product you want to add : \"Sweets\" , \"Cheese\" , \"Vine\" , or - write \"End\" to complete the purchase ");
			String f = "";
			int n = 0;
			while (true) {
				f = sc.nextLine();
				switch (f) {
				case "Sweets":
					System.out.println("Enter the quantity");
					n = sc.nextInt();
					al.add(new Sweets("Choco", 1200, n));
					d += ((1200 * n) - (1200 * n) * 10 / 100);
					break;
				case "Cheese":
					System.out.println("Enter the quantity");
					n = sc.nextInt();
					al.add(new Cheese("Cheddar", 3000, n));
					d += ((3000 * n) - (3000 * n) * 5 / 100);
					break;
				case "Vine":
					System.out.println("Enter the quantity");
					n = sc.nextInt();
					al.add(new Vine("Vino", 6000, n));
					d += ((6000 * n) - (6000 * n) * 35 / 100);
					break;
				case "End":
					System.out.println("Total price :" + d + "\n " + al);
					break;
				}
				
			}
		case "Delete":
			System.out.println(
					"Choose a product you want to delete : \"Sweets\" , \"Cheese\" , \"Vine\" , or - write \"End\" to complete the purchase ");
			while (true) {
				f = sc.nextLine();
				switch (f) {
				case "Sweets":
					System.out.println("Enter the quantity");
					n = sc.nextInt();
					al.remove(new Sweets("Choco", 1200, n));
					d -= ((1200 * n) - (1200 * n) * 10 / 100);
					break;
				case "Cheese":
					System.out.println("Enter the quantity");
					n = sc.nextInt();
					al.remove(new Cheese("Cheddar", 3000, n));
					d -= ((3000 * n) - (3000 * n) * 5 / 100);
					break;
				case "Vine":
					System.out.println("Enter the quantity");
					n = sc.nextInt();
					al.remove(new Vine("Vino", 6000, n));
					d -= ((6000 * n) - (6000 * n) * 35 / 100);
					break;
				case "End":
					System.out.println("Total price :" + d + "\n " + al);
					break;
				}
				
			}
		case "End":
			System.out.println("Total price :" + d + "\n " + al);
			break;
		}

		return d;
	}

	public double deal() {
		double d = 0;
		for (Product p : products) {
			d += (p.getPrice() * p.getQuantity()) - (p.getPrice() * p.getQuantity() * p.getDiscount() / 100);
		}
		return d;
	}

	public String list() {
		String d = " ";
		for (Product p : products) {
			d += p.getName() + "*" + p.getQuantity() + " , ";
		}
		return d;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [seller=").append(seller).append(", buyer=").append(buyer).append(", products=")
				.append(products).append(", deadline=").append(deadline).append(", sc=").append(sc).append("]");
		return builder.toString();
	}

}
