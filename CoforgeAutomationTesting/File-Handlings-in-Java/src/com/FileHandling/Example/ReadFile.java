package com.FileHandling.Example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		
		try {
			File obj = new File("D:/Files/bablu.txt");
			
			Scanner myread = new Scanner(obj);
			
			while(myread.hasNextLine()) {
				String data = myread.nextLine();
				System.out.println(data);
				
				
			}
			myread.close();
			
		} catch(FileNotFoundException e){
			System.out.println("en error occured - file not found");
			e.printStackTrace();
		}
		

	}

}
