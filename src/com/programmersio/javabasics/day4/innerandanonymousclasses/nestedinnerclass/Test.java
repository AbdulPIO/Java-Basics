package com.programmersio.javabasics.day4.innerandanonymousclasses.nestedinnerclass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Swift");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.start();
        engine.stop();
    }
}
