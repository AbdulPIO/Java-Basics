package com.programmersio.javabasics.week3day2.linkedlist.creatinglinkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insertFirst(12);
        ll.insertFirst(23);
        ll.insertFirst(44);
        ll.insertFirst(34);
        ll.insertFirst(98);
        ll.insertLast(97);
        ll.insert(120,3);
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.delete(2));
        ll.display();
    }
}
