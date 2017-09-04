package com.teamgoran.model;

public class Student extends User {

	public Student(String userName, String password) {
		super(userName, password);
		
	}

	@Override
	public double getDiscount() {
		return 25;
	}

	

}
