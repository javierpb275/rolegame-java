package com.javi.rolegamejava;

import java.util.Scanner;

import com.javi.rolegamejava.models.User;
import com.javi.rolegamejava.models.Warrior;
import com.javi.rolegamejava.models.Wizard;
import com.javi.rolegamejava.models.Character;
import com.javi.rolegamejava.models.Rogue;

public class Main {

	public static void main(String[] args) {
		
		 String username;
		 String email;
		 String password;
		 
		 String name;
		 String race;
		 int userclass;
		
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

		
		
		//Create a new character
		System.out.println("Please, enter your the name of your character:");
		name = s.nextLine();
		
		System.out.println("Please, enter your race:");
		race = s.nextLine();
		
		System.out.println("Please, choose a class:");
		System.out.println("1) Warrior");
		System.out.println("2) Wizard");
		System.out.println("3) Rogue");
		userclass = s.nextInt();
		
		switch(userclass) {
		case 1:
			Character myWarrior = new Warrior();
			myWarrior.setName(name);
			myWarrior.setRace(race);
			break;
		case 2:
			Character myWizard = new Wizard();
			myWizard.setName(name);
			myWizard.setRace(race);
			break;
		case 3:
			Character myRogue = new Rogue();
			myRogue.setName(name);
			myRogue.setRace(race);
			break;
		}
		
		
	}

}
