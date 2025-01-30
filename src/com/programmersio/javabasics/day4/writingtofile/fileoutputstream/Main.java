package com.programmersio.javabasics.day4.writingtofile.fileoutputstream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        FileOutputStream fOut = new FileOutputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\day4\\writingtofile\\fileoutputstream\\hello.txt",true);
        String str = "AMK";

        // If file doesn't exist new file will be created.
        // we are converting to char array as it is a byte stream
        char[] ch = str.toCharArray();
//        for(int i =0;i<str.length();i++) {
//            fOut.write(ch[i]);
//        }
        int i = 0;
        while(i<str.length()){
            fOut.write(ch[i]);
            i++;
        }
        fOut.close();
    }
}
