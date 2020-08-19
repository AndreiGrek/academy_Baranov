package by.academy.homework4;

import java.util.HashMap;
import java.util.Map;

/*
 * Задача 3. Можно писать все в main. Не нужно создавать новых классов. Имеется
 * текст. Следует составить для него частотный словарь: Создать Map<Character,
 * Integer> для символов, в который мы заносим символ и его количество.
 */
public class Task3 {
	public static void main(String[] args) {
		String text = "Можно писать все в main. Не нужно создавать новых классов";
		char[] charArray = text.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			putInMap(map, charArray[i]);
		}
		for (Map.Entry<Character, Integer> p : map.entrySet()) {
			System.out.println("Символ \'" + p.getKey() + "\': количество = " + p.getValue());
		}

	}

	public static void putInMap(Map<Character, Integer> m, Character ch) {
		if (m == null) {
			return;
		}
		if (m.containsKey(ch)) {
			m.put(ch, m.get(ch) + 1);
		} else {
			m.put(ch, 1);
		}
	}
}
