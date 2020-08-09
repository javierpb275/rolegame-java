package com.javi.rolegamejava.models;

public class Warrior extends Character {
	
	//Constructor
	public Warrior() {
		
		attack = 5;
		defense = 15;
		
	}
	
	//Methods:
	
	//This method is used to attack the enemy and lower their defense
		public int smash(Character enemy) {
				
			return enemy.defense -= this.attack;
				
		}

}
