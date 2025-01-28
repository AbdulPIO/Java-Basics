package com.programmersio.javabasics.constructors;

public class Test {

    public static void main(String[] args) {
        Student student = new Student("Abdul", 1, 23);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getRollNumber());
    }
}
