package com.programmersio.javabasics.day4.writingtofile.bufferedwriter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4\\writingtofile\\bufferedwriter\\note.txt",true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Hello, my name is Abdul\n");
        bf.close();
    }
}
