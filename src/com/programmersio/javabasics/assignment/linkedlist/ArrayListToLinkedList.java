package com.programmersio.javabasics.assignment.linkedlist;

import java.util.*;

public class ArrayListToLinkedList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer num : arrayList) {
            linkedList.add(num);
        }

        System.out.println("Initial LinkedList: " + linkedList);

        addElement(linkedList, 2, 25);
        removeElement(linkedList, 4);
        iterateLinkedList(linkedList);
    }

    private static void addElement(LinkedList<Integer> list, int index, int value) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, value);
            System.out.println("After adding " + value + " at index " + index + ": " + list);
        } else {
            System.out.println("Invalid index for adding element.");
        }
    }

    private static void removeElement(LinkedList<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            int removedValue = list.remove(index);
            System.out.println("After removing element " + removedValue + " at index " + index + ": " + list);
        } else {
            System.out.println("Invalid index for removing element.");
        }
    }

    private static void iterateLinkedList(LinkedList<Integer> list) {
        System.out.println("Iterating through LinkedList:");
        for (Integer num : list) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}