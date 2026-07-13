package com.DecisionMakingControlStatements.Examples;

public class Login_Validation {

	public static void main(String[] args) {
		
		boolean username = true;
		boolean password = true;
		
		if (username && password) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Failed");
		}

	}

}