/*Создать лямбда выражение, которое проверяет, что строка не пуста, 
	используя функциональный интерфейс Predicate.*/

package by.academy.classwork.lesson12;

import java.util.function.Predicate;

public class Task3 {
	public static void main(String... strings) {
		Predicate <String> isEmpty = s -> !s.equals("");
		String s = "";
		System.out.println(isEmpty.test(s));
		System.out.println(isEmpty.test("Блаблабла"));
	}
}