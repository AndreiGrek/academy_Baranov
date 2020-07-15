package by.academy.classwork.Task4;

public class Reader {
	private String name;
	private int number;
	private String fakultet;
	private int birthDate;

	public void takeBook(int quontity) {
		System.out.println("Петров взял " + quontity + " книги");
	}

	public void takeBook(String... books) {
		System.out.print("Петров взял книги: ");
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i] + " ");
		}
		System.out.println();

	}

	public void takeBook(Book book) {
		System.out.println("Петров взял книгу " + book.author);
	}

	public void returnBook() {

		Reader[] reader = new Reader[3];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
}
