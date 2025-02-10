package com.programmersio.javabasics.week3day5.sortinglists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingUsingComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(21);
        list.add(13);
        list.add(45);
        list.add(32);
        list.add(10);
        list.add(77);

        System.out.println("Before Using Comparator: " + list);

        list.sort(Comparator.reverseOrder());
        System.out.println("After Using reverseOrder of Comparator: " + list);
    }
}
