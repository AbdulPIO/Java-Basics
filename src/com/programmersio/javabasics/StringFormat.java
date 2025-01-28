package com.programmersio.javabasics;

public class StringFormat {
    public static void main(String[] args) {
        // printf -> an optional method to control, format and display text to the console
        //           window
        //           two arguments = format string + (object/variable/value)
        //           % [flags] [precision] [width] [conversion-character]

        System.out.printf("%d This is a format string\n", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Programmers";
        int myInt = 50;
        double myDouble = 10000;

        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);

        System.out.printf("Hello %20s%n",myString);

        System.out.printf("Your bank balance: %.2f", myDouble);
    }
}
