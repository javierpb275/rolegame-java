package com.javi.rolegamejava.models;

//This is the parent class, which extends from User (grandparent class)
public class Character extends User {
	
	//protected attributes so that its child can have access to them.
	protected String name;
	protected String race;
	protected int damage;
	protected int defense;
	
	//Constructors
	public Character(String username, String email, String password, String name, String race, int damage,
			int defense) {
		super(username, email, password);
		this.name = name;
		this.race = race;
		this.damage = damage;
		this.defense = defense;
	}
	
	public Character() {
		
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	
}
