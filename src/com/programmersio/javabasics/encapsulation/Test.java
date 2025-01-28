package com.programmersio.javabasics.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(-15);
        System.out.println(student.getAge());

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(58450212);
        bankAccount.deposit(-10);
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw(10);
        System.out.println(bankAccount.getBalance());


    }
}
