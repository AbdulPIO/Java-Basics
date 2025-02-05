package com.programmersio.javabasics.week3day3.sortedmaps;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args)
    {
        SortedMap<Integer, String> sm
                = new TreeMap<>();
        sm.put(2, "B");
        sm.put(3, "C");
        sm.put(5, "E");
        sm.put(4, "D");
        sm.put(1, "A");

        System.out.println(sm);

        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap(3)); // not include toKey
        System.out.println(sm.tailMap(3));
    }
}
