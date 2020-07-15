package by.academy.classwork.vehicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.professions.Driver;

public class Car {
	String brand;
	String carClass;
	int weight;
	private Driver driver;
	private Engine engine;

	public Car(String brand, String carClass, int weight) {
		super();
		this.brand = brand;
		this.carClass = carClass;
		this.weight = weight;
	}
	
	

	public Car(Driver driver, Engine engine) {
		super();
		this.driver = driver;
		this.engine = engine;
	}



	public void start() {
		System.out.println("Поехали");
	}

	public void stop() {
		System.out.println("Останавливаемся");
	}

	public void turnLeft() {
		System.out.println("Поворачиваем налево");
	}

	public void turnRight() {
		System.out.println("Поворачиваем направо");
	}

	public void printInfo() {
		System.out.println("Марка автомобиля: " + brand + ", её класс: " + carClass + ", её вес " + weight + " кг");
		System.out.println("Водителя зовут " + driver.name );
	}

}
