package com.programmersio.javabasics.day4assignments;

import java.io.*;
import java.util.Scanner;

public class PrintingLongestWord {
    public static void main(String[] args) throws IOException
    {
        System.out.println(new PrintingLongestWord().longestWord());
    }

    public String longestWord() throws IOException{

        String lngstWord = "";
        String current;

        File file = new File("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4assignments\\text.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNext()){
            current = sc.next();
            if(current.length()>lngstWord.length()){
                lngstWord=current;
            }
        }
        return lngstWord;
    }
}
