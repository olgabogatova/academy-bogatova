package by.academy.homework.product;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Deal {

	private User seller;
	private User buyer;
	private Product [] products;
	private Date deadline;
		
	public Deal() {
			super();	
			init();
			
		}
	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		init();
		
	}
	
	private void init () {
		Calendar c=  new GregorianCalendar();
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
	
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {  
		this.products = products;
	}
	
	
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	public double deal() {
		double d=0;
		for(Product p: products) {
			d+=(p.getPrice()*p.getQuantity())-(p.getPrice() * p.getQuantity()*p.getDiscount()/100);
		}
		return d;
	}
	
	public String list() {
		String d= " ";
		for(Product p: products) {
			d +=p.getName() + "*" +  p.getQuantity() + " , ";
		}
		return d;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [seller=").append(seller).append(", buyer=").append(buyer).append(", products=")
				.append(Arrays.toString(products)).append("]");
		return builder.toString();
	}
	
	
}
