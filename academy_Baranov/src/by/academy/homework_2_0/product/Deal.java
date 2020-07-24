package by.academy.homework_2_0.product;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Deal {
Scanner sc = new Scanner(System.in);
	private User seller;
	private User buyer;
	private Product[] products;
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

	public Deal(User seller, User buyer) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		init();

	}

	public void init() {
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

//Сумма сделки без учета скидки
	public double deal() {
		double d = 0;
		for (Product p : products) {
			d += p.getPrice() * p.getQuantity();
		}
		return d;
	}

	public String list() {
		String d = " ";
		for (Product p : products) {
			 d += p.getName() + " " +  p.getQuantity() + " шт, ";
		}
		return d;
	}

//	Сумма скидки
	public double discountDeal() {
		double d = 0;
		for (Product p : products) {
			d += p.getPrice() * p.getQuantity() * p.getDiscount() / 100;
		}
		return d;
	}

//	Итоговая сумма с учетом скидки
	public double finalDeal() {
		double d = 0;
		for (Product p : products) {
			d += p.getPrice() * p.getQuantity() - p.getPrice() * p.getQuantity() * p.getDiscount() / 100;
		}
		return d;
	}

	public void addProduct( ) {
		System.out.println("Введите название нового продукта");
		products[3].setName(sc.next());
		System.out.println("Введите цену нового продукта");
		products[3].setPrice(sc.nextInt());
		System.out.println("Введите количество нового продукта");
		products[3].setQuantity(sc.nextInt());
		System.out.println("Добавлен новый продукт " + products[3].getName());
		System.out.println("Новый список продуктов: " + list());
	}
	
	public void deleteProduct() {
		products[3].setName("");
		products[3].setPrice(0);
		products[3].setQuantity(0);
		System.out.println("Информация о продукте удалена");
		System.out.println("Новый список продуктов: " + list());
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [seller=").append(seller).append(", buyer=").append(buyer).append(", products=")
				.append(Arrays.toString(products)).append("]");
		return builder.toString();
	}

}