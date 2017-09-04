package com.teamgoran.model;

public class kid extends User {

	public kid(String userName, String password) {
		super(userName, password);
		
	}

	@Override
	public double getDiscount() {
		return 20;
	}


}
