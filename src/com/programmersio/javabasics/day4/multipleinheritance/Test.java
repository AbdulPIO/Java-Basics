package com.programmersio.javabasics.day4.multipleinheritance;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();

        smartphone.makeCall("3248309304");
        smartphone.endCall();
        smartphone.takePhoto();
    }
}
