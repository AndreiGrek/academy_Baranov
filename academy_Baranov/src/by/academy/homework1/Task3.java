package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
public static void main (String []args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Введите число от 1 до 10");
	int k = scan.nextInt();
	for (int i=1; i<=10; i++) {
		System.out.println(k + " * " + i + " = " + i*k);
	}
	
}
}
