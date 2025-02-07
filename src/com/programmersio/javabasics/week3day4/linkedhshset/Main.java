package com.programmersio.javabasics.week3day4.linkedhshset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Raj");
        linkedHashSet.add("Bhuvan");
        linkedHashSet.add("Abdul");
        linkedHashSet.add("Amit");
        linkedHashSet.add("Abdul");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Raj");
        hashSet.add("Bhuvan");
        hashSet.add("Abdul");
        hashSet.add("Amit");

        // Insertion order is not maintained.
        System.out.println("hashSet: " + hashSet);
        // Insertion order is maintained.
        System.out.println("linkedHashSet: " + linkedHashSet);
    }
}
