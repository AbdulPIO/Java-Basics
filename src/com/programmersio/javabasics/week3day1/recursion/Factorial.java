package com.programmersio.javabasics.week3day1.recursion;

import org.w3c.dom.ls.LSOutput;

public class Factorial {
    static int factorial(int n){
        if (n<=1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int fact = Factorial.factorial(1000);
        System.out.println(fact);
    }
}
