package com.javi.rolegamejava.models;

import java.util.Vector;

//This is the grandparent class, which is the user that registers and signs in.
public class User {
	
	//private attributes since only user can have access to them.
	private String username;
	private String email;
	private String password;
	
	//This is an array (Vector) of Characters that each User may have
	private int count = 0;
	
	private Vector<Character> listOfCharacters = new Vector<Character>();//We use the Vector class to create a vector of objects
	
	//Constructors:
	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	
	public User() {
		
	}

	
	//Getters and Setters
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	//Methods:
	
	//Create new Character:
	public void createCharacter(Character userCharacter) {
		
		  listOfCharacters.add(userCharacter);//This add method comes with the Vector class and it adds a new Character to the vector
		 
		  count++;
		
	}
	
	//Choose Character:
	public Character chooseCharacter(int i) {
		
		if (i < count) {
			return listOfCharacters.elementAt(i);//This elementAt() method comes with the Vector class and it allows us to select an element of the vector
		}
		
		else {
			return null;
		}
		
	}
	
	//Show list of Characters with their characteristics:
	public void showListOfCharacters() {
		System.out.println("You have: " + count + " Characters");
		
		for(int i = 0; i < count; i++) {
			
			Character character = listOfCharacters.elementAt(i);
			
			
			if (character instanceof Warrior) {
				System.out.println("Nº: " + i + " Race: " + character.race + " Class: Warrior"  + 
						" Name: " + character.name + " Attack: " + character.attack + " Defense: " + character.defense);
			}
			
			else if (character instanceof Wizard) {
				System.out.println("Nº: " + i + " Race: " + character.race + " Class: Wizard"  + 
						" Name: " + character.name + " Attack: " + character.attack + " Defense: " + character.defense);
			}
			
			else if (character instanceof Rogue) {
				System.out.println("Nº: " + i + " Race: " + character.race + " Class: Rogue"  + 
						" Name: " + character.name + " Attack: " + character.attack + " Defense: " + character.defense);
			}
			
		}
			
			
	}
	
	

}
