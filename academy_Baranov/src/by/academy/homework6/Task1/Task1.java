package by.academy.homework6.Task1;

/*Stream/Lambda.
Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел 
в диапазоне от 0 до 100. Каждое число умножить на PI и отнять 20. Отфильтровать, 
оставив числа меньшие 100. Отсортировать по возрастанию. Пропустив первые 3 числа 
произвести следующие операции:
Преобразовать лист чисел в Map (операция collect), где ключем является само число а 
значением строка: ("Number: " + value)*/

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		Map<Long, String> map = Stream.generate(() -> new Random().nextInt(100)).map(i -> (long) (i * Math.PI - 20))
				.limit(100).filter(x -> x < 100).sorted().skip(3).distinct()
				.collect(Collectors.toMap(k -> k, v -> "Number: " + v));

		Map<Long, String> treeMap = new TreeMap<>(map);
		for (Map.Entry<Long, String> p : treeMap.entrySet()) {
			System.out.println("\'" + p.getKey() + "\' " + p.getValue());
		}
	}

}