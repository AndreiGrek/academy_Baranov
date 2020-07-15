package by.academy.classwork.Task1;

public class Phone {
	private int number;
	private String model;
	private int weight;

	public void sendMessage(int... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Отправить сообщение на номер " + arr[i]);
		}
	}

	public void reciveCall(String name) {
		System.out.println("Звонит " + number + " " + name);
	}

	public void reciveCall(String name, int number) {

	}

	public Phone() {
		super();
	}

	public Phone(int number, String model) {
		super();
		this.number = number;
		this.model = model;

	}

	public Phone(int number, String model, int weight) {
		super();
		this.number = number;
		this.model = model;
		this.weight = weight;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
