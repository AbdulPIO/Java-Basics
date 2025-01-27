package com.programmersio.javabasics.inheritance.humans;

public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Sam");
        child.setAge(10);

        Parent parent = new Parent();
        parent.setAge(30);
        parent.setName("Bob");
    }
}
