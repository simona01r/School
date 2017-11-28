package se.school.model;

import se.school.model.*;

public class Athlet extends Person {

	private int noOfMedals;

	public Athlet() {
	}

	public Athlet(String name, String address, int age, int noOfMedals) {
		super(name, address, age);
		this.noOfMedals = noOfMedals;
	}

	public int getNoOfMedals() {
		return noOfMedals;
	}

	@Override
	public String toString() {
		return "[ Athlet " + super.toString() + "]";
	}
}
