package com.AccessModifiers;

class A {
	int x = 100;
}

public class Private {

	public static void main(String[] args) {
		
		A obj = new A();
		
		int output = obj.x;
		
		System.out.println("o/p is :"+ output);

	}

}
