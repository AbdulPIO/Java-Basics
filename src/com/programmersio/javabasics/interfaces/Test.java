package com.programmersio.javabasics.interfaces;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        System.out.println(Dog.MAX_AGE);
        Animal.info();

        dog.run();
    }
}
