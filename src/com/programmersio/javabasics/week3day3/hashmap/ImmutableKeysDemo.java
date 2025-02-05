package com.programmersio.javabasics.week3day3.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableKeysDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        Map<List<Integer>, Integer> map = new HashMap<>();
        map.put(list, 1);
        System.out.println(map.get(list));

        list.add(2); // mutating the list
        System.out.println(map.get(list)); // return null as it is using elements of the list to calculate the hashcode and the list got updated.
    }
}
