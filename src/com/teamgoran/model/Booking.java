package com.teamgoran.model;

import com.toedter.calendar.JDateChooser;

public class Booking {

	String from;
	String to;
	JDateChooser date1;
	JDateChooser date2;
	User traveler;

	public Booking(String from, String to, JDateChooser date1, JDateChooser date2, User traveler) {
		this.from = from;
		this.to = to;
		this.date1 = date1;
		this.date2 = date2;
		this.traveler = traveler;
	}
	
	public JDateChooser getDate2() {
		return date2;
	}

	public void setDate2(JDateChooser date2) {
		this.date2 = date2;
	}

	public JDateChooser getDate() {
		return date1;
	}

	public void setDate(JDateChooser date1) {
		this.date1 = date1;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	

	public User getTraveler() {
		return traveler;
	}

	public void setTraveler(User traveler) {
		this.traveler = traveler;
	}

}
