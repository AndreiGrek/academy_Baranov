/*Написать лямбда выражение для интерфейса Printable, 
	который содержит один метод void print().*/

package by.academy.classwork.lesson12;

public class Task1 {

	public static void main(String[] args) {
		Printable pr = () -> System.out.println("Печатаем какой-то текст");
		pr.print();

	}

}

interface Printable {
	void print();
}
