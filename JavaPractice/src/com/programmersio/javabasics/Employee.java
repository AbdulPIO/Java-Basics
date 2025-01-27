package com.programmersio.javabasics;

public class Employee {
    private int salary;

    public void setSalary(int s){
        if(s<0){
            s = -s;
        }
        this.salary=s;
    }

    public int getSalary() {
        return this.salary;
    }
}
