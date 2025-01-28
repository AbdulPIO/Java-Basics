package com.programmersio.javabasics.encapsulation;

public class Student {
    // properties/fields/instance variable & behavior/methods
    private String name;

    private int rollNumber;

    private int age;

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
