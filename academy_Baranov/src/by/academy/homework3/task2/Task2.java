package by.academy.homework3.task2;
//Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.

//Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
//Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
//Содержит методы:
//1) добавления в наш массив объекта типа T - add(T obj) 
//(нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
//2) взятие по индексу get(int i)
//3) взятие последнего элемента getLast()
//4) взятие первого элемента getFirst()
//5) вывод размера массива
//6) вывод индекса последнего заполненого элемента (не путать с размерностью)
//7) удаление элемента по индексу (remove(int i)
//8) удаление элемента по значению (remove(T obj))

public class Task2<T> {
	private T[] array;
	private int counter;

	@SuppressWarnings("unchecked")
	public Task2(T[] array) {
		super();
		array = (T[]) new Object[16];
	}

	public Task2(int size) {
		super();
		array = (T[]) new Object[size];
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	// 1) добавление в наш массив объекта типа T - add(T obj)
	public void add(T obj) {
		if (array == null) {
			return;
		}

		if (array.length == counter) {
			T[] temp = (T[]) new Object[array.length * 2 + 1];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}
		array[counter++] = obj;

	}

//	2) взятие по индексу get(int i)
	public T getItem(int index) {
		if (index >= 0 && index < array.length) {
			return array[index];
		} else {
			System.out.println("Error! Incorrect index!");
			return null;
		}
	}

//	3) взятие последнего элемента getLast() 
	public T getLast() {
		return array[array.length - 1];
	}

//	4) взятие первого элемента getFirst()
	public T getFirst() {
		return array[0];
	}

//	5) вывод размера массива
	public int getArrayLength() {
		return array.length;
	}

// 6) вывод индекса последнего заполненого элемента (не путать с размерностью)
	public void printNoNull() {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != null) {
				System.out.println("Последний заполненный элемент: " + array[i]);
				return;
			}
		}
	}

// 7) удаление элемента по индексу (remove(int i)
	public void removeByInd(int index) {
		if (array == null || index < 0 || index > array.length - 1) {
			System.out.println("Error! Incorrect Index!");
			return;
		} else if (index == array.length - 1) {
			array[index] = null;
		} else {
			System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
			array[array.length - 1] = null;
		}
	}

//	8) удаление элемента по значению (remove(T obj))
	public void removeByValue(T val) {
		if (array == null || val == null) {
			return;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (val.equals(array[i])) {
					removeByInd(i);
					return;
				}
			}
		}
	}
}
