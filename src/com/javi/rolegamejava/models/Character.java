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
		public void attacks(Character enemy, int random) {
			
					if (random <= 5)	{
						
						System.out.println("\n" + this.getName() + " attacks " + enemy.getName() + "\n");
						
						enemy.defense -= this.attack;
						
						System.out.println(enemy.getName() + " has " + enemy.getDefense() + " points of defense \n");
						
						
						if(enemy.defense <= 0) {
							System.out.println("You have defeated your enemy! You Win!");
						}
						
						else {
							System.out.println("\n" + enemy.getName() + " attacks " + this.getName() + "\n");
							
							this.defense -= enemy.attack;
							
							System.out.println(this.getName() + " has " + this.getDefense() + " points of defense \n");
						}
					}
					
					else if (random >= 6) {
						
						System.out.println("\n" + enemy.getName() + " attacks " + this.getName() + "\n");
						
						this.defense -= enemy.attack;
						
						System.out.println(this.getName() + " has " + this.getDefense() + " points of defense \n");
						
						
						if(this.defense <= 0) {
							System.out.println("\nYou have been defeated! You Lose!\n");
						}
						
						
						else {
							System.out.println("\n" + this.getName() + " attacks " + enemy.getName() + "\n");
							
							enemy.defense -= this.attack;
							
							System.out.println(enemy.getName() + " has " + enemy.getDefense() + " points of defense \n");
							
							if(enemy.defense <= 0) {
								System.out.println("\nYou have defeated your enemy! You Win!\n");
							}
						}
						
					}
			
							
		}
	
		
}
