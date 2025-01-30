package com.programmersio.javabasics.day4.readingcsvfile;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4\\readingcsvfile\\details.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line="";

        while((line=bufferedReader.readLine())!=null){
            String[] tokens = line.split(",");
            for(String token:tokens){
                System.out.println(token.trim());
            }
            System.out.println();
        }
    }
}
