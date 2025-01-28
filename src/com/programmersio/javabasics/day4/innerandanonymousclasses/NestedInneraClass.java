package com.programmersio.javabasics.day4.innerandanonymousclasses;

class Outer {
    class Inner {
        public void show() {
            System.out.println("In a nested class inner method");
        }
    }
}

public class NestedInneraClass {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}
