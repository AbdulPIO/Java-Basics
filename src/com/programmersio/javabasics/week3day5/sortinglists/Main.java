package com.programmersio.javabasics.week3day5.sortinglists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(6);
        System.out.println("Before Sorting: " + list);

        Collections.sort(list);
        System.out.println("After Sorting: " + list);
    }
}
