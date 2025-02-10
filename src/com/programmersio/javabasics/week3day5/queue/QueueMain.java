package com.programmersio.javabasics.week3day5.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class QueueMain {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
//        Deque<String> deque = new LinkedList<>(); // as LinkedList also implements Deque interface.

        // Queue - FIFO
        deque.add("Jaipur");
        deque.add("Delhi");
        deque.add("Jodhpur");

        // Removing and printing from head
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());

        // Stack - LIFO
        deque.push("Jaipur");
        deque.push("Delhi");
        deque.push("Jodhpur");

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}
