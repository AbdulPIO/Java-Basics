package com.programmersio.javabasics.day4assignments;

import java.io.*;
import java.nio.Buffer;

public class WritingInReverseOrder {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4assignments\\file1.txt";
        String outputFile = "C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4assignments\\file2.txt";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder content = new StringBuilder();
            String line;

            while((line = reader.readLine()) != null){
                content.append(line).append("\n");
            }
            reader.close();

            content.reverse();

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile,true));
//            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(content.toString());
            writer.close();

            System.out.println("File Reversed Successfully.");
        } catch (IOException e){
            System.out.println("An error occurred. "+e.getMessage());
        }
    }
}
