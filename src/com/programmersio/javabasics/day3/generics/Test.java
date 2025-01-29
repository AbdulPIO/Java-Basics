package com.programmersio.javabasics.day3.generics;

public class Test {

    public static void main(String[] args) {

//        Box<Integer> box = new Box<>();
//        box.setValue(1);
//        //String str = (String) box.getValue(); error at compile time and type-safety
//        int i = box.getValue();
//        System.out.println(i);

        //Pair Generic Class
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
