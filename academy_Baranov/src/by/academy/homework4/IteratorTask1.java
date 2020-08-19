package by.academy.homework4;
/*Задача 1.
Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
Протестировать в main.*/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorTask1<E> implements Iterator<E>{

	private E [][] array;
	private Integer i = 0;
	private Integer j = 0;
	
	
	
	
	public IteratorTask1(E[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		
		return array != null && i < array.length && j < array[i].length && array[i][j] != null;
	}

	@Override
	public E next() {
		
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		if (j + 1 < array[i].length) {
			return array[i][j++];
		} else {
			int temp = j;
			i++;
			j = 0;
			return array[i - 1][temp];
	}
	}
}
