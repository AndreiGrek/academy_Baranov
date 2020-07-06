package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите тип данных");
		String type = scan.next();
		System.out.println("Введите число");
		String str = scan.next();
		switch (type) {
		case "int":
			int i = Integer.parseInt(str);
			System.out.println(i % 2);
			break;
		case "double":
			double d = Double.parseDouble(str);
			System.out.println(d * 0.7);
			break;
		case "float":
			float f = Float.parseFloat(str);
			System.out.println(f * f);
			break;
//		case "char":
//			char ch = Character.parseChar();
		case "String":
			System.out.println("Hello " + str);
			break;
		default:
			System.out.println("Unsupported type");

		}

	}
}
