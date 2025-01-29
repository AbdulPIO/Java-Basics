package com.programmersio.javabasics.day4.fileclass;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4\\fileclass\\names.txt");
        f1.createNewFile(); // Does not create new file every time it is created.
        System.out.println("Does File Exist: "+ f1.exists());
        System.out.println("File Size: "+ f1.length());
        System.out.println("Is Readable: "+ f1.canRead());
        System.out.println("Is Writable: "+ f1.canWrite());

//        f1.delete();// deletes the file
    }
}
