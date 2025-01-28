package com.programmersio.javabasics.day4.innerandanonymousclasses.staticinnerclass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Latitude", "Windows");
        computer.getOs().displayInfo();

        // Static Inner Class
        Computer.USB usb= new Computer.USB("TYPE-C");
    }
}
