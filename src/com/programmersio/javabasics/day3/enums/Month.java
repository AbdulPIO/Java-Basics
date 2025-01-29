package com.programmersio.javabasics.day3.enums;

public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
    SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public void display(){
        System.out.println("This is the month of "+this.name());
    }
}
