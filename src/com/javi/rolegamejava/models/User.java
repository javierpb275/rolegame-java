package com.javi.rolegamejava.models;

//This is the grandparent class, which is the user that registers and signs in.
public class User {
	
	//private attributes since only user can have access to them.
	private String username;
	private String email;
	private String password;
	
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
	
	
	
	

}
