package com.programmersio.javabasics.day4assignments;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency
{
    static void CountWords(String filename, Map<String, Integer> words) throws IOException
    {
        Scanner file=new Scanner (new File(filename));
        while(file.hasNext()){
            String word=file.next();
            Integer count=words.get(word);
            if(count!=null) {
                count++;
            }
            else {
                count = 1;
            }
            words.put(word,count);
        }
        file.close();
    }

    public static void main(String[] args)
    {
        Map<String,Integer> words=new HashMap<>();
        try{
            CountWords("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4assignments\\text.txt",words);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(words);
    }
}