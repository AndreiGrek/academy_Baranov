package by.academy.homework4;
/*Задача 1.
Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
Протестировать в main.*/

public class Task1 {

	public static void main(String[] args) {
		Integer[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		IteratorTask1 <Integer> arrIterator = new IteratorTask1 <Integer>(array);
		while (arrIterator.hasNext()) {
			System.out.println(arrIterator.next());
		}

	}

}
