package com.programmersio.javabasics.day5.trycatchblock;

public class DivideByZero {
    public static void main(String[] args) {
        int[] numerators = {10,20, 30, 40};
        int[] denominators = {1, 2, 0, 4};
        for (int i = 0; i < numerators.length; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        System.out.println("Division Complete");
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        } catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }
    }
}
