package by.academy.homework3.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание 1.

//Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class Date {
	Pattern p = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");
	Year year;
	Month month;
	Day day;
	String date;

	public Date(String date) {
		super();
		this.date = date;

	}

	public Date(Year year, Month month, Day day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDate(String date) {
		if (!validateDate(date)) {
			System.out.println("Wrong date format");
			return;
		}
		year = new Year(date.substring(6));
		month = new Month(date.substring(3, 5));
		day = new Day(date.substring(0, 2));
	}

	private boolean validateDate(String date) {
		Matcher m = p.matcher(date);
		return m.find();
	}

}

class Year {

	int year;

	public Year(String year) {
		super();
		this.year = Integer.parseInt(year);

	}

}

class Month {
	int month;

	public Month(String month) {
		super();
		this.month = Integer.parseInt(month);

	}
}

class Day {
	int day;

	public Day(String day) {
		super();
		this.day = Integer.parseInt(day);
	}
}
enum DayWeek {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	private int dayNumber;

	private DayWeek(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public int getDayNumber(int dayNumber) {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}
}

