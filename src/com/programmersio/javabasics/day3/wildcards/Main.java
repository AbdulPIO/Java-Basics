package com.programmersio.javabasics.day3.wildcards;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public void printArrayList(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
