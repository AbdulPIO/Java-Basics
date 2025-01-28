package com.programmersio.javabasics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        System.out.println("Number is: "+ a);

        System.out.println("Enter a String: ");
        String str= sc.next();
        System.out.println("String is: "+ str);

        sc.nextLine();

        System.out.println("Enter a String: ");
        String str1 = sc.nextLine();
        System.out.println("String is: "+ str1);

        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character is: "+ ch);
    }
}
