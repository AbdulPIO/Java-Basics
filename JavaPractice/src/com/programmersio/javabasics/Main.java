package com.programmersio.javabasics;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

/*
        int a = sc.nextInt();
        String str = sc.nextLine();

        System.out.println(a+" "+str);
*/

        Employee emp = new Employee();
        emp.setSalary(-100000);
        System.out.println(emp.getSalary()); // here even though salary entered
        // is -ve but we get +ve because we used setter and getter and
        // implemented program to convert -ve to +ve before assigning.
    }
}