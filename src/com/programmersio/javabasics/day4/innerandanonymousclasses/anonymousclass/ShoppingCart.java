package com.programmersio.javabasics.day4.innerandanonymousclasses.anonymousclass;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentMethod){
        paymentMethod.Pay(totalAmount);
    }
}
