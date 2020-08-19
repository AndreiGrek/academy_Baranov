package by.academy.homework4;
//Создать свое исключение CustomException.
//Попробовать добавить в массив int на 8 элементов 10 чисел. 
//Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
//"Array is to small, expand the array". После чего выкинуть свое исключение CustomException.

public class Task4 {

	public static void main(String[] args)  throws CustomException {
		try {
			int[] array = new int[8];
			System.out.println(array[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array is to small, expand the array");
			throw new CustomException();
		}

	}

}
