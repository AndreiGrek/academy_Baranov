package by.academy.homework3.task3;

public class Vodka extends Product {
//	Процент скидки
	private double discount = 20;

	public Vodka() {
		super();

	}

	public Vodka(String name, double price, int quantity) {
		super(name, price, quantity);

	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
