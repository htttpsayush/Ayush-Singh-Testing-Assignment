package ScannerDemo;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter yr first name ");
		
		String first = sc.nextLine();
		
		System.out.print("please enter yr last name ");
		
		String last = sc.nextLine();
		
		System.out.print("please enter yr house number ");
		
		String hn = sc.nextLine();
		
		System.out.print("please enter yr street name ");
		
		String s = sc.nextLine();
		
		System.out.print("please enter yr street type ");
		
		String st = sc.nextLine();
		
		System.out.print("please enter yr city name ");
		
		String city = sc.nextLine();
		
		System.out.println(first + " "+ last + " "+ hn + " ");
		System.out.println(s + " "+ st+" "+ city);


	}

}
