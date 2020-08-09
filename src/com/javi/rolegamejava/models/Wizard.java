package com.javi.rolegamejava.models;

public class Wizard extends Character {
	
	//Constructor
		public Wizard() {
			
			attack = 15;
			defense = 5;
			
		}
		
	//Methods:
		
		//This method is used to attack the enemy and lower their defense
		public int fireBall(Character enemy) {
					
			return enemy.defense -= this.attack;
					
		}

}
