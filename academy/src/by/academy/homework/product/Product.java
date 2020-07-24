package by.academy.homework.product;

public class Product {

	private String name;
	private double price;
	private int quantity;
	protected int discount;
	
	public Product() {
		super();
	}
	
	public Product(String name,double price,int quantity, int discount) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;

	}
	
	public Product(String name,double price,int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount (int discount) {
		this.discount = discount ;
	}
	
	public double fullPriceWithDiscount() {
		double a=0;
		a= (quantity*price)-((price*quantity*discount)/100);
		return a;
	}
	public double fullPrice () {
		return quantity*price;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=").append(name).append(", price=").append(price).append(", quantity=")
				.append(quantity).append(discount).append("]");
		return builder.toString();
	}
	
	
	
	
}
