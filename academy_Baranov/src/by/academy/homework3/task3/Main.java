package by.academy.homework3.task3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import by.academy.homework_2_0.task5.BelarusPhoneValidator;
import by.academy.homework_2_0.task5.EmailValidator;
import by.academy.homework_2_0.task5.Validator;

/*
 *  Необходимо реализовать программу, которая будет позволять вводить сделки  купли-продажи товаров между двумя участниками. В каждой сделке может быть
 * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма  каждого товара рассчитывается из его стоимости и количества. Программа должна
 * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на  экран. Ввод информацию осуществляется с экрана (консоли). Количество
 * дополнительной информацию о сделке, участнике, товаре придумать самому  (больше одного поля для класса).
 */

public class Main {
	public static void main(String[] args) {

		User seller = new User("Вася", "+375292808120", "vasia@mail.ru", "08.09.1991");
		User buyer = new User("Петя", "+3752928457886124", "petia@@mail.ru", "34.18.7777");
		List <Product> products = new ArrayList<>();
		products.add(new Vodka("Водка", 10, 10));
		products.add(new Pivo("Пиво", 2, 25));
		products.add(new Whiskey("Виски", 30, 2));
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
		System.out.println("Список продуктов: " + deal.list());
		System.out.println("Общая сумма сделки без учета скидки: " + deal.deal() + " рублей");
		System.out.println("Сумма скидки: " + deal.discountDeal() + " рублей");
		System.out.println("Итоговая сумма сделки с учетом скидки: " + deal.finalDeal() + " рублей");
		System.out.println("--------------");
		
		

	}
}