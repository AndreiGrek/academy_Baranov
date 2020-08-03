package by.academy.homework3.task2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Task2<Integer> t2 = new Task2<>(5);

		t2.add(10);
		t2.add(12);
		t2.add(10);
		t2.add(132);
		t2.add(22);
		System.out.println(Arrays.toString(t2.getArray()));
		t2.removeByInd(2);
		System.out.println(Arrays.toString(t2.getArray()));
		t2.removeByValue(22);
		System.out.println(Arrays.toString(t2.getArray()));
		t2.printNoNull();
	}

}
