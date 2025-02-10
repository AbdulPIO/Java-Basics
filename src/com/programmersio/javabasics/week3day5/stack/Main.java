package com.programmersio.javabasics.week3day5.stack;

import java.util.Stack;

public class Main {

    static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stackPop(Stack<Integer> stack) {
        System.out.println("Pop Operation: ");

        for (int i = 0; i < 5; i++) {
            Integer x = (Integer) stack.pop();
            System.out.println(x);
        }
    }

    static void stackPeek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stackSearch(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1) {
            System.out.println("Element Not Found.");
        } else {
            System.out.println("Element Found at position: " + pos);
        }
    }

    static void stackEmpty(Stack<Integer> stack) {
        if (stack.empty()){
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Stack is Not Empty.");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stackEmpty(stack);
        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 2);
        stackSearch(stack, 6);
        stackEmpty(stack);
    }
}
