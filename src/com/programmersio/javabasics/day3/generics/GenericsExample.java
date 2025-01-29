package com.programmersio.javabasics.day3.generics;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("XYZ");
        list.add("ABC");
        String s1 = list.get(0);
        String s2 = list.get(1);
        System.out.println(s1+" "+s2);
    }
}
