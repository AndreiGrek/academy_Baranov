package by.academy.classwork.Task2;

public class Main {

	public static void main(String[] args) {
		Person man = new Person();
		Person woman = new Person("Катя", 22);
		man.setFullName("Вася");
		man.talk();
		woman.talk();
	}

}
