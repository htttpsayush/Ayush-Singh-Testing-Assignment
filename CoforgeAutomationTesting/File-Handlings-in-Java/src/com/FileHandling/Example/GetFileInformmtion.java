package com.FileHandling.Example;

import java.io.File;

public class GetFileInformmtion {

	public static void main(String[] args) {
		
		File myobj = new File("D:/Files/bablu.txt");
		
		if(myobj.exists()) {
			
			System.out.println("File Name :-  "+ myobj.getName());
			System.out.println("Absolute Path"+myobj.getAbsolutePath());
			System.out.println("Writable "+myobj.canWrite());
			System.out.println("Readable "+myobj.canRead());
			System.out.println("File size in bytes "+myobj.length());
			
		} else {
			System.out.println("File does not exist");
		}

	}

}
