package com.javi.rolegamejava;

import java.util.Scanner;

import com.javi.rolegamejava.models.User;

public class Main {

	public static void main(String[] args) {
		
		 String username;
		 String email;
		 String password;
		
		//This the Scanner class to be able to type info in the console
		Scanner s = new Scanner(System.in);
		
		//We ask the user info:
		System.out.println("Please, enter your username:");
		username = s.nextLine();
		
		System.out.println("Please, enter your email:");
		email = s.nextLine();
		
		System.out.println("Please, enter your password:");
		password = s.nextLine();
		
		//create new user
		User user = new User(username, email, password);
		
		//checking if we can print the user info:
		System.out.println("I am " + user.getUsername() + ". My email is " + user.getEmail() + ". My password is " + user.getPassword());

	}

}
