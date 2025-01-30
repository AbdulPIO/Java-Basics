package com.programmersio.javabasics.day5.customexceptions;

public class InsufficientFundsException extends Exception{

    private double amount;

    public InsufficientFundsException(double amount) {
        super("Insufficient Balance!"); // calling Exception class constructor
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
