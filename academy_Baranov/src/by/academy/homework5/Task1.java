package homework5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Прочесть информацию введеную из клавиатуры и записать в созданный вами txt файл, 
//если введена "stop" строка тогда закончить запись в файл.

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку");
		String s = sc.nextLine();
		File file = new File("src/by/academy/homework5/task1.txt");
		try {
			FileWriter fw = new FileWriter(file);
		
			while (!s.equals("stop")) {
			fw.write(s + " ");
			s = sc.nextLine();
		}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
