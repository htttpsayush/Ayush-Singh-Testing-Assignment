package com.FileHandling.Example;

import java.io.File;
import java.io.IOException;

public class FileHandlings {

    public static void main(String[] args) {

        try {
            File myobj = new File("D:/Files/bablu.txt");

            if (myobj.createNewFile()) {
                System.out.println("File Created: " + myobj.getName());
                System.out.println("Absolute Path: " + myobj.getAbsolutePath());
            } else {
                System.out.println("File already Created");
            }

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}