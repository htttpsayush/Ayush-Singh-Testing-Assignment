package ScannerDemo;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name :-");
		
		// reads the entire word
		
		String value = input.next();
		
		System.out.println("text Entered : "+ value);
		
		input.close();

	}

}
