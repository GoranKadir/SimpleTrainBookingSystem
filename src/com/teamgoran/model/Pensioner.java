package com.teamgoran.model;

public class Pensioner extends User {

	public Pensioner(String userName, String password) {
		super(userName, password);
		
	}
	@Override
	public double getDiscount() {
		return 10;
	}

}
