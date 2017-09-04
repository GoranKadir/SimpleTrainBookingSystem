package com.teamgoran.model.data;

import java.rmi.NoSuchObjectException;
import java.util.Arrays;
import java.util.List;

import com.teamgoran.model.Adult;
import com.teamgoran.model.Pensioner;
import com.teamgoran.model.Student;
import com.teamgoran.model.User;
import com.teamgoran.model.kid;

public class UserData {
	
	//En list som tar emot user med deras användarnamn och password!
	private static final List<User> users = Arrays.asList(
			new kid("GoranKid", "losen"),
			new kid("EminemKid", "password"),
			new Student("HajarStudent", "westside"),
			new Student("AlexStudent", "dator"),
			new Adult("GoggieAdult", "1"),
			new Adult("ZlatanAdult", "passen"),
			new Pensioner("ConorPensioner", "stockholm"),		
			new Pensioner("FloydPensioner", "macbook")
			);
	
	//En method som tar emot User objekt och kollar ifall username man skriver in matcher med det man har i listan
	public static User getUser(String username) throws NoSuchObjectException {
		for(User user : users){
			if(user.getUserName().equals(username)){
				return user;
			}
		}
		throw new NoSuchObjectException("The usersname doest exist");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
