package com.programmersio.javabasics.day3.innerandanonymousclasses.anonymousclass;

public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(150);

        shoppingCart.processPayment(new Payment() {
            @Override
            public void Pay(double amount) {
                System.out.println("Paid " + amount + " using Credit Card.");
            }
        });

        shoppingCart.processPayment(new Payment(){
            @Override
            public void Pay(double amount) {
                System.out.println("Paid " + amount + " using Paypal.");
            }
        });
    }
}
