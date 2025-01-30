package com.programmersio.javabasics.day4assignments;

import java.io.*;

public class AppendingToFile {
    public static void main(String[] args) throws IOException
    {
        FileWriter fileWriter = new FileWriter("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4assignments\\names.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello, my name is Abdul\n");
        bufferedWriter.close();
    }
}
