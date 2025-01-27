package com.programmersio.javabasics;

public class Methods {
    static double sum(double x, double y){
        return x+y;
    }

    static double avg(double x, double y){
        double sum = sum(x, y);
        return sum/2;
    }

    public static void main(String[] args) {
        float d = (float)sum(3.0f,(float)4.0);
        System.out.println(d);

        double d2 = avg(3.0,2.0);
        System.out.println(d2);
    }
}
