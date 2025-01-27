package com.programmersio.javabasics;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher("9");

        if(matcher.matches()){
            System.out.println("Pattern Matched Successfully.");
        }
        else{
            System.out.println("Invalid Pattern");
        }
    }
}
