package com.programmersio.javabasics.abstraction;

public class Car extends Vehicle{

    private final int speedLimit = 200;

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating");
    }

    @Override
    public void decelerate() {
        System.out.println("Decelerating");
    }
}
