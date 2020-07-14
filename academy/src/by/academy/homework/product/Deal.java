package by.academy.homework.product;

public class Deal {

	private User seller;
	private User buyer;
		private Product [] products;
		
	public Deal() {
			super();	
		}
	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		
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
	
	public double deal() {
		double d=0;
		for(Product p: products) {
			d+=p.getPrice()*p.getQuantity();
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
}
