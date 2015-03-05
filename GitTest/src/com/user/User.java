package com.user;

public class User {

	private String name;

	public User(String name) {
		this.name = name;
	}

	public void display(){
		System.out.println("User name: " + this.name);
	}

}
