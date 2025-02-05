package com.programmersio.javabasics.week3day3.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("HashMap Demo");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Joe", 25);
        map1.put("Jairus", 35);
        map1.put("Anmol", null);
        System.out.println(map1);

        map1.put("Anmol", 23);
        System.out.println(map1);

        System.out.println("Contains Joe? " + map1.containsKey("Joe"));
        System.out.println("Joe's age: " + map1.get("Joe"));

        System.out.println("Iterating using keySet...");
        Set<String> names = map1.keySet(); // backed by original map
        for (String name : names){
            System.out.println("Name: " + name + ", Age: " + map1.get(name));
        }

        System.out.println("Iterating using entrySet...");
        Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
        for (HashMap.Entry<String, Integer> mapping : mappings){
            System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
        }

        names.remove("Joe"); // reflect in original map
        System.out.println(map1);
    }
}
