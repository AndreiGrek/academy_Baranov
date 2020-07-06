package by.academy.homework1;

import java.util.Scanner;


public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите сумму покупки: ");
		double sum = scan.nextDouble();
		System.out.println("Введите свой возраст: ");
		int age = scan.nextInt();
		if (sum < 100) {
			sum = sum - sum * 0.05;
			System.out.println("Финальная цена с учетом скидки: " + sum);
		} else if (sum >= 100 && sum < 200) {
			sum = sum - sum * 0.07;
			System.out.println("Финальная цена с учетом скидки: " + sum);
		} else if (sum >= 200 && sum < 300) {
			if (age > 18) {
				sum = sum - sum * 0.16;
			} else 
			sum = sum - sum * 0.09;
			System.out.println("Финальная цена с учетом скидки: " + sum);
		} else if (sum >= 300 && sum < 400) {
			sum = sum - sum * 0.15;
			System.out.println("Финальная цена с учетом скидки: " + sum);
		} else if (sum >= 400) {
			sum = sum - sum * 0.2;
			System.out.println("Финальная цена с учетом скидки: " + sum);
		}

	}
}
