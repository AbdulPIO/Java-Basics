package com.programmersio.javabasics;

public class Loops {
    public static void main(String[] args) {
        // For Loop in Java

        // Simple For Loop
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(i);
        }

        // Nested For Loop
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        int[] arr = {1,2,3,4,5};
        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        /* While-Loop */
        int x = 1;
        while(x<=5){
            System.out.print(x+" ");
            x++;
        }

        System.out.println();

        // Do-While Loop
        int y = 1;
        do{
            System.out.print(y+" ");
            y++;
        }while(y<=5);
    }
}
