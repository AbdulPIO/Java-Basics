package com.programmersio.javabasics.assignment.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            try {
                BigInteger result = factorial(BigInteger.valueOf(num));
                System.out.println("Factorial of " + num + " is: " + result);
            } catch (StackOverflowError e) {
                System.out.println("Error: Number is too large to compute factorial using recursion.");
            }
        }
        scanner.close();
    }

    private static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
