package com.programmersio.javabasics.day5.customexceptions;

public class BankAccount {

    private double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }
}
