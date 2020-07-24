package by.academy.homework_2_0.product;

public class Pivo extends Product {
//	Процент скидки
	private double discount = 10;

	public Pivo() {
		super();

	}

	public Pivo(String name, double price, int quantity) {
		super(name, price, quantity);

	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
