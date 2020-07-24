package by.academy.homework_2_0;

import java.util.Scanner;
//Условие здачи: ввести 2 слова, состоящие из четного числа букв. 
//Получить слово состоящее из первой половины первого слова и второй половины второго слова.
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово с четным количеством символов");
		String s1 = sc.next();
		System.out.println("Введите еще одно слово с четным количеством символов");
		String s2 = sc.next();
		int i = s1.length() / 2;
		int k = s2.length() / 2;
		String s3 = s1.substring(0, i).concat(s2.substring(k, s2.length()));
		System.out.println(s3);
	}

}
