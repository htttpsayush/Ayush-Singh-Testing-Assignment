package com.AccessModifiers;

public class extendedProtected extends B{

	public static void main(String[] args) {
		
		
		extendedProtected obj = new extendedProtected();
		int output = obj.z;
		System.out.println("value of x is:"+output);
		obj.ProtectedMethod();
		

	}

}
