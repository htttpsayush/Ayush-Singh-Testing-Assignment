package com.Constructors.Example;

public class C_2_Constructor {
	
	//constructor 1
	public C_2_Constructor(int a , int b) {
		int c = a+b;
		System.out.println("Summation is :"+ c);
	}
	
	// constructor 2
	public C_2_Constructor(double a , double b) {
		double c = a+b;
		System.out.println("Summation is :"+ c);
	}

	
// method
	public void display() {
		System.out.println("Constructor overloading is working success fully");
	}
	
	public static void main(String[] args) {
		C_2_Constructor obj1 = new C_2_Constructor(10,20);
		C_2_Constructor obj2 = new C_2_Constructor(50,80);
		obj1.display();
		obj2.display();
		
	}
}
