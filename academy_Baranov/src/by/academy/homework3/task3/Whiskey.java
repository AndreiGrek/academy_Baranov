package by.academy.homework3.task3;

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
