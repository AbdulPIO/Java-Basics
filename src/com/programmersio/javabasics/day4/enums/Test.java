package com.programmersio.javabasics.day4.enums;

// declared outside class
enum Weekdays {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;}

public class Test {

    // declared inside class
    public enum Season {WINTER,SPRING,SUMMER,FALL}

    public static void main(String[] args) {
        for(Season s: Season.values()){
            System.out.println(s);
        }

        // .valueOf
        System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));

        // .ordinal()
        System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());

        for(Weekdays w: Weekdays.values()){
            System.out.println(w);
        }

        Weekdays w1 = Weekdays.MONDAY;
        System.out.println("Value of w1 is: "+ w1);

        System.out.println(Month.JANUARY);
    }
}
