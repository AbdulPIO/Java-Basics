package com.programmersio.javabasics.assignment.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee  implements Serializable {
    private static final long serialVersionUID = 123L;
    private String name;
    private int age;
    private int EmpID;
//    private int salary;

    public Employee(String name, int age, int EmpID){
        this.name = name;
        this.age = age;
        this.EmpID = EmpID;
    }

    @Override
    public String toString() {
        return String.format("Person{name = %s, age = %d, EmpId = %d}", name, age, EmpID);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Mark", 28, 10011);

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AbdulKhan\\JavaPractice\\src\\com\\programmersio\\javabasics\\assignment\\serialization\\employee.ser"))){
            out.writeObject(employee);
            System.out.println("Object Serialized Successfully.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
