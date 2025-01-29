package com.programmersio.javabasics.day4.readingfile.bufferedreader;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {

        FileReader fr = new FileReader("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4\\readingfile\\bufferedreader\\names.txt");
        BufferedReader bf = new BufferedReader(fr);
//        int ch;
//        while((ch=bf.read())!=-1){
//            System.out.print((char)ch);
//        }

        // reading using readLine() method
        String s1;
        while((s1=bf.readLine())!=null){
            System.out.println(s1);
        }

        bf.close();
    }
}
