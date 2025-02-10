package com.programmersio.javabasics.week3day5.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(23);
        pq.add(99);
        pq.add(12);
        pq.add(2);
        pq.add(35);

        System.out.println("Natural Order In Priority Queue: ");
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // Using comparator for reverse order
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(23);
        pq1.add(123);
        pq1.add(5);
        pq1.add(34);
        pq1.add(76);

        System.out.println("Comparator for custom sorting in Priority Queue: ");
        while(!pq1.isEmpty()) {
            System.out.println(pq1.poll());
        }
    }
}
