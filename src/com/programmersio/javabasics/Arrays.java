package com.programmersio.javabasics;

import java.util.Scanner;

public class Arrays {

    static void minimum(int[] arr1){
        int min=arr1[0];
        for(int i=1;i<arr1.length;i++)
            if(min>arr1[i])
                min=arr1[i];

        System.out.println("Minimum Value in Array is : "+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Values in Array: ");
        int[] arr = new int[5];
        for(int i = 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Values: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        minimum(arr);

        //int arr2D[][] = new int[3][3]; 2D array in Java

        int arr2D[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}
