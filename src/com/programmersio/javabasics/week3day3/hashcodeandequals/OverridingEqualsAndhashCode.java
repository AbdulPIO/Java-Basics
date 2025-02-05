package com.programmersio.javabasics.week3day3.hashcodeandequals;

class Student {

    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public boolean equals(Student std) {
        if (std.rollNumber == this.rollNumber){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.rollNumber;
    }
}

public class OverridingEqualsAndhashCode {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Aman");
        Student s2 = new Student(1, "Aman");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
