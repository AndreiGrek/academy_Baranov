package by.academy.homework3.task3;



public class Product {

	private String name;
	private double price;
	private int quantity;
	private double discount;
	
	public Product() {
		super();
	}
	
	public Product(String name,double price,int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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
	
	
	public double fullPrice () {
		return quantity*price;
	}

	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=").append(name).append(", price=").append(price).append(", quantity=")
				.append(quantity).append("]");
		return builder.toString();
	}
	
	
	
	
}