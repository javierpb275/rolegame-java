package com.javi.rolegamejava;

import com.javi.rolegamejava.models.User;

public class Main {

	public static void main(String[] args) {
		
		//create new user
		User user1 = new User("pepe", "pepe@gmail.com", "123");
		
		//checking if we can print the user info:
		System.out.println("I am " + user1.getUsername() + ". My email is " + user1.getEmail() + ". My password is " + user1.getPassword());

	}

}
