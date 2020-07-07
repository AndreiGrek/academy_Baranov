package by.academy.homework1;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи первую строку ");
		String s1 = scan.next();
		System.out.println("Введи вторую строку  ");
		String s2 = scan.next();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int equal = 0;
		
		if (s1.length()==s2.length()) {
		for (int i = 0; i<s1.length(); i++) {
			for (int j = 0; j<s2.length(); j++) {
				if(ch1[i]==ch2[j]) {
					equal ++;
				}
			}
		}
		}
		if (equal ==s1.length()) {
System.out.println("Строки равны");
	} else {
		System.out.println("Строки не равны");
	}
}
}	
