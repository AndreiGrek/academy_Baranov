package by.academy.homework6.Task2;

public class User extends Person {
private String login;
private String password;
private String email;


public User() {
	super();
}


public User(String login, String password, String email) {
	super();
	this.login = login;
	this.password = password;
	this.email = email;
}


public String getLogin() {
	return login;
}


public void setLogin(String login) {
	this.login = login;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "User [login=" + login + ", password=" + password + ", email=" + email + "]";
}





}
