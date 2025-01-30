package com.programmersio.javabasics.day5.multicatchblock;

public class Main {
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
//            System.out.println(array[10]);
            array[9] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
