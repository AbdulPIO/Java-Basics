package com.programmersio.javabasics.day4.innerandanonymousclasses.anonymousclass;

public class CreditCardV0 implements Payment{

    private String creditCardNumber;

    public CreditCardV0(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void Pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
