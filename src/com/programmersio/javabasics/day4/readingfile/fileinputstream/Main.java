package com.programmersio.javabasics.day4.readingfile.fileinputstream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        int i;
        FileInputStream fis = new FileInputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4\\readingfile\\fileinputstream\\hello.txt");

        do{
          i=fis.read();
          if(i!=-1){
              System.out.print((char)i);
          }
        }while(i!=-1);
        fis.close();
    }
}
