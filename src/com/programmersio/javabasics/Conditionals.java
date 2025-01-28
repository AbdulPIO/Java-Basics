package com.programmersio.javabasics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        // FizzBuzz Program - if num divisible by 3-> Fizz, if divisible by 5-> Buzz, if divisible by both-> FizzBuzz
        System.out.println("Enter a Number to check Fizz, Buzz or FizzBuzz: ");
        int x = sc.nextInt();

        if (x%3==0 && x%5==0){
            System.out.println("FizzBuzz");
        } else if (x%3==0) {
            System.out.println("Fizz");
        }else if (x%5==0) {
            System.out.println("Buzz");
        }else{
            System.out.println("Invalid Number");
        }

    }
}
