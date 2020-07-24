package by.academy.homework_2_0.product;

public class Whiskey extends Product{
//	Процент скидки
	private double discount = 40;
	
	public Whiskey() {
		super();
		
	}

	public Whiskey(String name, double price, int quantity) {
		super(name, price, quantity);
		
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
