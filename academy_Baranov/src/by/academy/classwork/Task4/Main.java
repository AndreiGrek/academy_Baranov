package by.academy.classwork.Task4;

public class Main {

	public static void main(String[] args) {
		Reader reader = new Reader ();
		Book book = new Book("приключения", "словарь" , "энциклопедия" );
		reader.takeBook(3);
		reader.takeBook("Прикючения", "Словарь", "Энциклопедия");
		reader.takeBook(book.author);
		

	}

}
