package com.FileHandling.Example;

import java.io.FileWriter;

public class WriteToFile {

    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("D:/Files/bablu.txt");

            myWriter.write("Welcome To Coforge Technologies! All the best for learning!");

            myWriter.close();

            System.out.println("Successfully wrote to the file");

        } catch (Exception e) {

            System.out.println("An error occurred.");

            e.printStackTrace();
        }
    }
}