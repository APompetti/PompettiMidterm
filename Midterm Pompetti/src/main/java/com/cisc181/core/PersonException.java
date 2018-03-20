package main.java.com.cisc181.core;

public class PersonException extends Exception {
	private Person person;
	public PersonException(String msg, Person per) {
		super(msg);
		this.person = per;
	}

}
