package by.academy.homework3.task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
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

public class MyCustomDate {

	Year year;
	Month month;
	Day day;
	private String date;

	public MyCustomDate() {

	}

	public MyCustomDate(String date) {
		this.date = date;
		setDate(date);

	}

	public MyCustomDate(Year year, Month month, Day day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDate(String date) {
		this.year = new Year(date.substring(6));
		this.month = new Month(date.substring(3, 5));
		this.day = new Day(date.substring(0, 2));

	}

	public String getDayOfWeek(int dayOfWeek) {
		String s;
		switch (dayOfWeek) {
		case (1):
			return s = "Заданный день: " + DayOfWeek.SUNDAY.getName();
		case (2):
			return s = "Заданный день: " + DayOfWeek.MONDAY.getName();
		case (3):
			return s = "Заданный день: " + DayOfWeek.TUESDAY.getName();
		case (4):
			return s = "Заданный день: " + DayOfWeek.WEDNESDAY.getName();
		case (5):
			return s = "Заданный день: " + DayOfWeek.THURSDAY.getName();
		case (6):
			return s = "Заданный день: " + DayOfWeek.FRIDAY.getName();
		case (7):
			return s = "Заданный день: " + DayOfWeek.SATURDAY.getName();
		default:
			return "";
		}

	}

	public long getDaysBetween(long firstDate, long secondDate) {
		long i = (firstDate - secondDate) / (1000 * 60 * 60 * 24);
		return i;
	}

	class Year {
		private int year;

		public Year() {

		}

		public Year(int year) {
			super();
			this.year = year;

		}

		Year(String year) {
			super();
			this.year = Integer.parseInt(year);
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String isLeapYear(int year) {
			if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {
				return "Год " + year + " является високосным";
			} else {
				return "Год " + year + " не является високосным";
			}
		}
	}

	class Month {
		private int month;

		public Month() {

		}

		public Month(int month) {
			super();
			this.month = month;
		}

		Month(String month) {
			super();
			this.month = Integer.parseInt(month);
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

	}

	class Day {
		private int day;

		public Day() {

		}

		public Day(int day) {
			super();
			this.day = day;
		}

		Day(String day) {
			super();
			this.day = Integer.parseInt(day);
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}
	}

	enum DayOfWeek {
		MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"),
		SATURDAY("Суббота"), SUNDAY("Воскресенье");

		String name;

		private DayOfWeek(String name) {

			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
