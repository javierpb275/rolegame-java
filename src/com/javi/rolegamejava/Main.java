package com.javi.rolegamejava;

import java.util.Random;
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
		 Character theCharacter;
		 Character theEnemy;
		 
		 int chooseClass;
		 int chooseRace;
		 int chooseCharacter;
		 
		 
		 
		 
		//This is the Random class which returns a random number
		 Random rand = new Random(System.nanoTime());
		
		 
		 
		//This is the Scanner class to be able to type info in the console
		Scanner s = new Scanner(System.in);
		
		
		//We ask the user info:
		System.out.println("\nPlease, enter your username:");
		username = s.nextLine();
		
		System.out.println("\nPlease, enter your email:");
		email = s.nextLine();
		
		System.out.println("\nPlease, enter your password:");
		password = s.nextLine();
		
		//create new user
		User user = new User(username, email, password);
		
		
		
		//checking if we can print the user info:
		System.out.println("\nI am " + user.getUsername() + ". My email is " + user.getEmail() + ". My password is " + user.getPassword());

		
		
		//Create a new character
		
		System.out.println("\nPlease, enter the name of your character:");
		name = s.nextLine();
		
		
		System.out.println("\nPlease, choose a class:");
		System.out.println("1) Warrior");
		System.out.println("2) Wizard");
		System.out.println("3) Rogue");
		chooseClass = s.nextInt();
		
		
		switch(chooseClass) {
		
		case 1:
			theCharacter = new Warrior();
			
			break;
		case 2:
			theCharacter = new Wizard();
			
			break;
		case 3:
			theCharacter = new Rogue();
			
			break;
		default:
			theCharacter = null;
			
		}
		
		
		System.out.println("\nPlease, choose a race:");
		System.out.println("1) Human");
		System.out.println("2) Elf");
		System.out.println("3) Dwarf");
		chooseRace = s.nextInt();
		
		switch(chooseRace) {
		
		case 1:
			theCharacter.setRace("Human");
			break;
		case 2:
			theCharacter.setRace("Elf");
			break;
		case 3:
			theCharacter.setRace("Dwarf");
			break;
		default:
			theCharacter = null;
			
		}
		
		
		theCharacter.setName(name);
		
		
		
		//Adding character to the list:
		user.addCharacter(theCharacter);
		System.out.println("\n" + theCharacter.getName() + " was added to your list of characters");
		
		
		//Choose your character:
		System.out.println("\nChoose a Character:\n");
		user.showListOfCharacters();
		
		chooseCharacter = s.nextInt();
		
		Character myCharacter = user.chooseCharacter(chooseCharacter);
		
		System.out.println("Your character is:\n");
		
		System.out.println(myCharacter.getName() + "\n");
		
		
		//Enemy created:
		int randomEnemy = rand.nextInt(2);//number between 0 - 2
		
		switch(randomEnemy) {
		
		case 0:
			theEnemy = new Warrior();
			theEnemy.setRace("Dwarf");
			
			break;
		case 1:
			theEnemy = new Wizard();
			theEnemy.setRace("Human");
			
			break;
		case 2:
			theEnemy = new Rogue();
			theEnemy.setRace("Elf");
			break;
		default:
			theEnemy = null;
			
		}
		
		theEnemy.setName("Enemy");
		
		System.out.println("\nA/An " + theEnemy.getRace() + " enemy has shown up" + "\n");
		
		//Battle:
		System.out.println("\nDo you want to fight? 1)Yes 2)No \n");
		
		int answer = s.nextInt();
		
		
		do {
			
			myCharacter.attacks(theEnemy);
			
			
			if (theEnemy.getDefense() > 0) {
				
				theEnemy.attacks(myCharacter);
				
				}
				
				else {
					System.out.println("");
				}
			
			
			if (theEnemy.getDefense() <= 0) {
				System.out.println(myCharacter.getName() + " has won.\n");
			}
			
			else if (myCharacter.getDefense() <= 0){
				System.out.println(theEnemy.getName() + " has won.\n");
			}
			
		}
		
		while(answer == 1 && (myCharacter.getDefense() > 0 && theEnemy.getDefense() > 0));
			
		
	}

}
