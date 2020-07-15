package by.academy.classwork.vehicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.professions.Driver;

public class Main {

	public static void main(String[] args) {

		
		Driver driver = new Driver ("Иванов И.И. ", 5);
		Engine engine = new Engine (1000, "Крутой двигатель");
		Car car = new Car (driver, engine);
		Car car1 = new Car("Жигули", "Низший класс", 1000);
	
	     car1.printInfo();
	}

}
