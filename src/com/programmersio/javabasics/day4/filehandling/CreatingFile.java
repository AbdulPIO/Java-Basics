package com.programmersio.javabasics.day4.filehandling;

import java.io.File;

public class CreatingFile {
    public static void main(String args[])
    {

        try {

            // Get the file
            File file = new File("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4\\filehandling\\file.txt");

            // Create new file
            // if it does not exist
            if (file.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
