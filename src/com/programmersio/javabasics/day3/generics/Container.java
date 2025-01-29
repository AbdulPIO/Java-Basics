package com.programmersio.javabasics.day3.generics;

public interface Container<T> {

    void add(T item);

    T get();
}
