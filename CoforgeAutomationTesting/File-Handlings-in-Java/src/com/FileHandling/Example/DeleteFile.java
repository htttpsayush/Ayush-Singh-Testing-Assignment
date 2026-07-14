package com.FileHandling.Example;

import java.io.File;
//import java.io.Exception;

public class DeleteFile {

    public static void main(String[] args) {

        try {
            File myobj = new File("D:/Files/bablu.xlsx");

            if (myobj.delete()) {
                System.out.println("delete the file: " + myobj.getName());
                
            } else {
                System.out.println("File alredy deleted");
            }

        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}