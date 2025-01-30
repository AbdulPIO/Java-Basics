package com.programmersio.javabasics.day5.finallyblock;

public class Main {
    public static void main(String[] args) {
        System.out.println(divide(1,0));
    }

    public static int divide(int a, int b){
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        } finally {
            System.out.println("Program Executed.");
        }
    }
}
