package by.academy.homework3.task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.temporal.ChronoUnit;

import by.academy.homework3.task1.MyCustomDate.DayOfWeek;

public class Main {
	static Pattern p = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");
	private static int dayOfWeek;
	static long daysBetween;
	static Scanner sc = new Scanner(System.in);
	static String date;

	public static void main(String[] args) {

		enterDate();
		MyCustomDate myDate = new MyCustomDate(date);
		System.out.println("---------");
		Calendar c = new GregorianCalendar(myDate.year.getYear(), myDate.month.getMonth() - 1, myDate.day.getDay());
		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(myDate.getDayOfWeek(dayOfWeek));
		System.out.println("----------");
		enterDate();
		MyCustomDate myDate2 = new MyCustomDate(date);
		Calendar c2 = new GregorianCalendar(myDate2.year.getYear(), myDate2.month.getMonth() - 1, myDate2.day.getDay());
		daysBetween = myDate.getDaysBetween(c.getTimeInMillis(), c2.getTimeInMillis());
		System.out.println("Количество дней между первой заданной датой и второй заданной датой: " + daysBetween);
		System.out.println("-----------");
		System.out.println(myDate.year.isLeapYear(myDate.year.getYear()));

	}

	public static boolean validateDate(String date) {
		Matcher m = p.matcher(date);
		return m.find();
	}

	public static void enterDate() {
		System.out.println("Введите дату в формате dd-mm-yyy");
		date = sc.next();
		if (validateDate(date) == true) {
			System.out.println("Date is valid");
		} else {
			System.out.println("Date is invaled");
		}
	}
}
