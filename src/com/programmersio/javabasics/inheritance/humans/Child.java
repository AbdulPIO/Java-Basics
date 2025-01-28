package com.programmersio.javabasics.inheritance.humans;

public class Child extends Parent{
    public void childMethod() {
        super.parentMethod();
        System.out.println("Child method called");
    }
}
