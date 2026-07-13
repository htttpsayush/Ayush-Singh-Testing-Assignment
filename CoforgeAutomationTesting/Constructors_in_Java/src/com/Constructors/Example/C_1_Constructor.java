package com.Constructors.Example;

public class C_1_Constructor {
	
	// constructor
	public C_1_Constructor() {
		
		System.out.println("This is the contructor block");
		
	}
	
	// Method 
	public void method() {
		System.out.println("This is the Method block");
	}
	

	public static void main(String[] args) {
		
		
		C_1_Constructor obj = new C_1_Constructor();
		
		// Constructor block will automatically invoked
		
		obj.method();

	}

}
