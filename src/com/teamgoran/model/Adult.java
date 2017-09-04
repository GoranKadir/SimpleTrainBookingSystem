package com.teamgoran.model;

public class Adult extends User {

	public Adult(String userName, String password) {
		super(userName, password);
	}
		
	
	@Override
	public double getDiscount() {
		return 10;
	}

	

	
}
