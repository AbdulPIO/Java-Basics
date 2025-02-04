package com.programmersio.javabasics.week3day2.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(1);

        arrayList.add(11);
        arrayList.add(21);
        arrayList.add(43);
        arrayList.add(56);
        arrayList.add(11);
        arrayList.add(78);
        arrayList.add(123);

        System.out.println("ArrayList: " + arrayList);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            int element = iterator.next();
            System.out.println("Element: " + element);

            if (element == 78) {
                iterator.remove(); //No error as we are using iterator
            }
        }
        System.out.println("ArrayList: " + arrayList);
    }
}
