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
		 Character myCharacter;
		 int chooseClass;
		 int chooseRace;
		
		//This is the Scanner class to be able to type info in the console
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
		
		System.out.println("Please, enter the name of your character:");
		name = s.nextLine();
		
		
		System.out.println("Please, choose a class:");
		System.out.println("1) Warrior");
		System.out.println("2) Wizard");
		System.out.println("3) Rogue");
		chooseClass = s.nextInt();
		
		
		switch(chooseClass) {
		
		case 1:
			myCharacter = new Warrior();
			
			break;
		case 2:
			myCharacter = new Wizard();
			
			break;
		case 3:
			myCharacter = new Rogue();
			
			break;
		default:
			myCharacter = null;
			
		}
		
		
		System.out.println("Please, choose a race:");
		System.out.println("1) Human");
		System.out.println("2) Elf");
		System.out.println("3) Dwarf");
		chooseRace = s.nextInt();
		
		switch(chooseRace) {
		
		case 1:
			myCharacter.setRace("Human");
			break;
		case 2:
			myCharacter.setRace("Elf");
			break;
		case 3:
			myCharacter.setRace("Dwarf");
			break;
		default:
			myCharacter = null;
			
		}
		
		
		myCharacter.setName(name);
		
		//checking if we can print the character info:
		System.out.println("My name is " + myCharacter.getName() + ". I am a/an " + myCharacter.getRace());
		
	}

}
