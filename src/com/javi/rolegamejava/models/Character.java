package com.javi.rolegamejava.models;

//This is the parent class and their children are Warrior, Wizard and Rogue
public class Character {
	
	//protected attributes so that its child can have access to them.
	protected String name;
	protected String race;
	protected int attack;
	protected int defense;
	
	//Constructors
	public Character(String name, String race, int attack,
			int defense) {
		super();
		this.name = name;
		this.race = race;
		this.attack = attack;
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

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	
	//Methods:
	
	//This method is used to attack the enemy and lower their defense
		public int attacks(Character enemy) {
							
			return enemy.defense -= this.attack;
							
		}
	
		
}
