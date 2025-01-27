package com.programmersio.javabasics.interfaces;

public interface Animal {

    int MAX_AGE = 150;

    public abstract void eat(); // no need for public abstract
    // as it is by default for methods in interfaces

    void sleep();

    public static void info(){
        System.out.println("This is an Animal Interface");
    }

    default void run(){
        this.eat();
        System.out.println("Animal is running.");
    }
}
