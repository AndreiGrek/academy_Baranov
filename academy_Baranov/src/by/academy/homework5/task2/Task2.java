package homework5.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Создать руками текстовый файл, закинуть следующий текст:
//Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.

public class Task2 {

	public static void main(String[] args) {
		File text = new File("src/by/academy/homework5/task2/Task2.txt");
		File result = new File ("src/by/academy/homework5/task2/result.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(text));
			FileWriter fw = new FileWriter(result);
			String s = br.readLine();
			while (s != null) {
				s = s.replaceAll(" ", "");
				fw.write(s);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
