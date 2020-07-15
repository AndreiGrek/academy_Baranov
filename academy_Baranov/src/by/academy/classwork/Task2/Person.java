package by.academy.classwork.Task2;

public class Person {
	String fullName;
	int age;

	

	public void move() {
		System.out.println(fullName + " говорит");
	}

	public void talk() {
		System.out.println(fullName + " говорит");
	}

	public Person(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}
	
	public Person() {
		super();
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}



