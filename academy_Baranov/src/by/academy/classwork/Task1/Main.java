package by.academy.classwork.Task1;

public class Main {

	public static void main(String[] args) {
		Phone samsung = new Phone(8029, "Самсунг", 100);
		Phone xiaomi = new Phone(8025, "Сайоми", 120);
		Phone iphone = new Phone(8033, "Айфон", 99);
		System.out.println("Первый телефон " + samsung.getModel() + ", его номер " + samsung.getNumber()
				+ " и его вес равен " + samsung.getWeight() + " грамм");
		System.out.println("Первый телефон " + xiaomi.getModel() + ", его номер " + xiaomi.getNumber()
				+ " и его вес равен " + xiaomi.getWeight() + " грамм");
		System.out.println("Первый телефон " + iphone.getModel() + ", его номер " + iphone.getNumber()
				+ " и его вес равен " + iphone.getWeight() + " грамм");
		samsung.reciveCall("Петя");
		xiaomi.reciveCall("Вася");
		iphone.reciveCall("Герасим");
		samsung.reciveCall("Петя", 8029);
		xiaomi.reciveCall("Вася", 8025);
		iphone.reciveCall("Герасим", 8033);
		samsung.sendMessage(samsung.getNumber());
		xiaomi.sendMessage(xiaomi.getNumber());
		iphone.sendMessage(iphone.getNumber());
	}

}
