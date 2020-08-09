package com.javi.rolegamejava;

import java.util.Scanner;

import com.javi.rolegamejava.models.User;

public class Main {

	public static void main(String[] args) {
		
		//This the Scanner class to be able to type info in the console
		Scanner s = new Scanner(System.in);
		
		//create new user
		User user1 = new User("pepe", "pepe@gmail.com", "123");
		
		//checking if we can print the user info:
		System.out.println("I am " + user1.getUsername() + ". My email is " + user1.getEmail() + ". My password is " + user1.getPassword());

	}

}
