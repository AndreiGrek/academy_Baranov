/*Написать лямбда выражение для интерфейса Printable, 
	который содержит один метод void print().*/

package by.academy.classwork.lesson12;

public class Task1 {

	public static void main(String[] args) {
		Printable pr = s -> System.out.println("Какой-то текст");
		String s = "";
		pr.print(s);

	}

}

interface Printable {
	void print(String s);
}
