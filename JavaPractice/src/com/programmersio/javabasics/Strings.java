package com.programmersio.javabasics;

class Car{
    String make = "Ford";
    String model = "Mustang";
    String color = "Black";
    int year = 2021;

    @Override
    public String toString(){
        return make+"\n"+model+"\n"+color+"\n"+year+"\n";
    }
}

public class Strings {
    public static void main(String[] args) {
        // JavaBasics.Strings, StringBuilder and StringBuffer and toString Method in Java
        char[] cArray = {'H','e','l','l','o'};
        String s = new String(cArray);
        System.out.println(s);


        //StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!");
        System.out.println(sb);
        sb.insert(5,"Java");
        System.out.println(sb);
        sb.delete(5,9);
        System.out.println(sb);

        //StringBuilder
        StringBuilder sbd = new StringBuilder("Abdul Mujeeb");
        System.out.println(sbd);

        Car car = new Car();
        System.out.println(car.toString());
    }
}
