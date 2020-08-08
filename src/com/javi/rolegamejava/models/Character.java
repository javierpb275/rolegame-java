package com.javi.rolegamejava.models;

//This is the parent class, which extends from User (grandparent class)
public class Character extends User {
	
	//protected attributes so that its child can have access to them.
	protected String name;
	protected String race;
	protected int damage;
	protected int defense;
	

}
