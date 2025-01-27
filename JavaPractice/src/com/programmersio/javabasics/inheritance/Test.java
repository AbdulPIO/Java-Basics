package com.programmersio.javabasics.inheritance;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("Bruno");
        dog.eat();
        dog.sayHello();

        Animal dog1 = new Dog(); // upcasting
        dog.sayHello();

        Dog myDog = (Dog) dog; // downcasting
    }
}
