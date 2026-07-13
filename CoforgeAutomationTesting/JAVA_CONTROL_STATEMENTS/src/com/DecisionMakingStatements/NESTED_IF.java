package com.DecisionMakingStatements;

public class NESTED_IF {

	public static void main(String[] args) {
		
		
		String address = "Delhi , India";
		
		if(address.endsWith("India")) {
			if(address.contains("Meerut")) {
				System.out.println("city is meerut");
			}
			else if (address.contains("Noida")) {
				System.out.println("your city is noida");
			}
			else {
				System.out.println(address.split(",")[0]);
			}
		}
		else {
			System.out.println("you are not living in India");
		}
		

	}

}
