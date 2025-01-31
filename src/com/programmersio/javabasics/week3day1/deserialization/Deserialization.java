package com.programmersio.javabasics.week3day1.deserialization;

import com.programmersio.javabasics.week3day1.serialization.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try(ObjectInputStream in =new ObjectInputStream(new FileInputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\week3day1\\serialization\\employee.ser"))){
            Employee employee = (Employee) in.readObject();
            System.out.println("Deserialized Object : " + employee);
        } catch ( IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
