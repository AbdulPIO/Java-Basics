package com.programmersio.javabasics.assignment.arraylist;

import java.util.*;

public class MergeArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        ArrayList<Integer> mergedList = mergeLists(list1, list2);

        System.out.println("Merged List without duplicates: " + mergedList);
    }

    private static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        Set<Integer> uniqueSet = new HashSet<>();
        uniqueSet.addAll(list1);
        uniqueSet.addAll(list2);

        return new ArrayList<>(uniqueSet);
    }
}
