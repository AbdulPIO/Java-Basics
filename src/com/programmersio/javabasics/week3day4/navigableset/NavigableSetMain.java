package com.programmersio.javabasics.week3day4.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMain {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(51);
        set.add(23);
        set.add(44);
        set.add(33);
        System.out.println(set);

        System.out.println("Lower: " + set.lower(44));
        System.out.println("Floor: " + set.floor(44));
        System.out.println("Ceiling: " + set.ceiling(44));
        System.out.println("Higher: " + set.higher(44));

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        System.out.println(set.headSet(24,false));

        System.out.println(set.subSet(5, 44));
    }
}
