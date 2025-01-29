package com.programmersio.javabasics.day3.generics;

// Box is a generic class with bounded parameters
public class Box<T extends Number> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
