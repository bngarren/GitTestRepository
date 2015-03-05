package com.application;

import com.user.User;

public class Main {

	public static void main(String[] arg){
		System.out.println("Welcome to GitTest!");
		System.out.println("This is our user:");

		User user = new User("bngarren");
		user.display();
	}

}
