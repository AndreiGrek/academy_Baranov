package by.academy.homework4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task2 {
	/*
	 * Задача 2. Создать список оценок учеников с помощью ArryList, заполнить
	 * случайными оценками. Найти самую высокую оценку с использованием итератора.
	 */
	public static void main(String[] args) {
	
		List <Integer> marks = new ArrayList<>();
		Random rand = new Random();
		for (int i =0; i<14; i++) {
			marks.add(rand.nextInt(10));
					
		}
		System.out.println("Список оценок учеников: " + marks);
		
		Iterator<Integer> it = marks.iterator();
		int max = 0;
		int temp;
		while (it.hasNext()) {
			temp = it.next();
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println("Максимальная оценка: " + max);

	}

}
