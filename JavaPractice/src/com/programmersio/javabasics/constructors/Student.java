package com.programmersio.javabasics.constructors;

public class Student {
    private String name;

    private int rollNumber;

    private int age;

    // Parameterized constructor
    public Student(String name, int rollNumber, int age){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age=age;
    }

    // Overloading default constructor
    public Student(){
        this.age =10;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        if(age<0){
            System.out.println("Invalid Age");
        }else{
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }
}
