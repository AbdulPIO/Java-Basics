package com.programmersio.javabasics.week3day3.hashtables;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put("Alice", 30);
        hashtable.put("Bob", 25);
        hashtable.put("Charlie", 35);

        // Displaying the Hashtable
        System.out.println("Initial Hashtable: " + hashtable);

        // Retrieving a value
        int age = hashtable.get("Alice");
        System.out.println("Alice's age: " + age);

        // Removing a key-value pair
        hashtable.remove("Bob");

        // Checking if a key exists
        boolean hasCharlie = hashtable.containsKey("Charlie");
        System.out.println("Hashtable contains Charlie: " + hasCharlie);

        // Iterating over the Hashtable
        System.out.println("Iterating over Hashtable:");
        for (String key : hashtable.keySet()) {
            System.out.println(key + ": " + hashtable.get(key));
        }
    }
}

