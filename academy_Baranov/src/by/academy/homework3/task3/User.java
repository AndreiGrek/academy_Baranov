package by.academy.homework3.task3;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

	private String name;
	private String phone;
	private String email;
	private String dateOfBirth;

	public User() {
		super();
	}

	public User(String name, String dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;

	}

	public User(String name, String phone, String email, String dateOfBirth) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void check() {
		Pattern p1 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1]).([0]?[1-9]|1[0-2]).\\d{4}");
		Matcher m1 = p1.matcher(getDateOfBirth());
		if (m1.find()) {
			System.out.println("Дата рождения введена правильно");
		} else {
			System.out.println("Дата рождения введена неправильно!");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=").append(name).append(", phone=").append(phone).append(", email=").append(email)
				.append(", dateOfBirth=").append(dateOfBirth).append("]");
		return builder.toString();
	}

}