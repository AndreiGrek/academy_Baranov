package by.academy.homework1;
//Решил выполнить задачу без метода Math.pow  :)
public class Task4 {
	public static void main(String[] args) {
	
		int m = 1;
		for (int i = 1; m < 1000000; i++) {
			m = 2*m;
			System.out.println("2 в " + i + " степени = " + m);
		}
	}

}
