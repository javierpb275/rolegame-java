package com.javi.rolegamejava.models;

//This is one of the children class, which extends from character
public class Rogue extends Character {
	
	//Constructor
		public Rogue() {
			
			attack = 10;
			defense = 10;
			
		}
		
		
	//Methods:
		
		//This method is used to attack the enemy and lower their defense
		public int stab(Character enemy) {
			
			return enemy.defense -= this.attack;
			
			
		}

}
