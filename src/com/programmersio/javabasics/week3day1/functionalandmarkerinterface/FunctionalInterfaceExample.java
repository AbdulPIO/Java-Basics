package com.programmersio.javabasics.week3day1.functionalandmarkerinterface;

@FunctionalInterface
interface Hello{
    void hi(String msg);
}


public class FunctionalInterfaceExample implements Hello{

    @Override
    public void hi(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterface = new FunctionalInterfaceExample();
        functionalInterface.hi("Hello");
    }
}
