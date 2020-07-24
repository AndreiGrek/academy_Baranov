package by.academy.homework_2_0.product;

import java.util.ArrayList;

import by.academy.homework_2_0.task5.BelarusPhoneValidator;
import by.academy.homework_2_0.task5.EmailValidator;
import by.academy.homework_2_0.task5.Validator;

public class Main2 {

	public static void main(String[] args) {
	

			User seller = new User("Вася", "+375292808120", "vasia@mail.ru", "08.09.1991");
			User buyer = new User("Петя", "+3752928457886124", "petia@@mail.ru", "34.18.7777");
//			Product[] products = { new Pivo("Пиво ", 2, 20), new Vodka("Водка ", 5, 10),
//					new Whiskey("Виски ", 50, 2) };
			ArrayList<Product> products = new ArrayList<>();
			Deal deal = new Deal(seller, buyer, products);
			
			
			Validator belarusPhoneValidator = new BelarusPhoneValidator();
			Validator emailValidator = new EmailValidator();

			System.out.println("Имя продавца: " + seller.getName() + ", а его день рождения " + seller.getDateOfBirth());
			seller.check();
			System.out.println("Проверка номера телефона: " + belarusPhoneValidator.validate(seller.getPhone()));
			System.out.println("Проверка e-mail: " + emailValidator.validate(seller.getEmail()));

			System.out.println("--------------");
			System.out.println("Имя покупателя: " + buyer.getName() + ", а его день рождения " + buyer.getDateOfBirth());
			buyer.check();
			System.out.println("Проверка номера телефона: " + belarusPhoneValidator.validate(buyer.getPhone()));
			System.out.println("Проверка e-mail: " + emailValidator.validate(buyer.getEmail()));
			System.out.println("--------------");
			System.out.println("Дедлайн выполнения сдекли: " + deal.getDeadline());
			System.out.println("Продукты: " + deal.list());
			System.out.println("Общая сумма сделки без учета скидки: " + deal.deal() + " рублей");
			System.out.println("Сумма скидки: " + deal.discountDeal() + " рублей");
			System.out.println("Итоговая сумма сделки с учетом скидки: " + deal.finalDeal() + " рублей");
			System.out.println("--------------");
			System.out.println(products[0].getQuantity());

		}
	}