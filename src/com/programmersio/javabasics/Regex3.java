package com.programmersio.javabasics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a word with one number between 0 - 9 :");
        // like hello1, programmers9
        String str = sc.next();
        Pattern pattern = Pattern.compile("[A-Za-z]+[0-9]");
        Matcher matcher = pattern.matcher(str);

        if(matcher.matches()){
            System.out.println("Pattern Matched");
        }else {
            System.out.println("Invalid Input");
        }
    }
}
