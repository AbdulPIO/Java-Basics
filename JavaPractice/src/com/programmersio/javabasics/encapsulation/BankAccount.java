package com.programmersio.javabasics.encapsulation;

public class BankAccount {
    private long accountNumber;

    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance =+ amount;
            System.out.println("Deposited : "+ amount);
        }else{
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew : "+ amount );
        }else{
            System.out.println("Invalid Amount or Insufficient Balance");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
