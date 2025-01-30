package com.programmersio.javabasics.day5.customexceptions;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        try{
            bankAccount.withdraw(1100);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
    }
}
