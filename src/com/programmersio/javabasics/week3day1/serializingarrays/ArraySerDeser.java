package com.programmersio.javabasics.week3day1.serializingarrays;

import java.io.*;

public class ArraySerDeser {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\week3day1\\serializingarrays\\array.ser"))){
            out.writeObject(array);
            System.out.println("Array Serialized Successfully.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\week3day1\\serializingarrays\\array.ser"))){
            int[] deserializedArray = (int[]) in.readObject();
            System.out.print("Deserialized Array: ");
            for (int num : deserializedArray) {
                System.out.print(num + " ");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
