package com.programmersio.javabasics.day4.readingfile.scanner;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        FileInputStream inputStream = new FileInputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4\\readingfile\\scanner\\text.txt");

        Scanner sc = new Scanner(inputStream);

        //StringBuffer to store the contents
        StringBuffer sb = new StringBuffer();

        //Appending each line to the buffer
        while (sc.hasNext()) {
            sb.append(" " + sc.nextLine());
        }
        System.out.println(sb);
    }
}
