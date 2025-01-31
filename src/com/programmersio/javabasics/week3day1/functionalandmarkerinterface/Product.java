package com.programmersio.javabasics.week3day1.functionalandmarkerinterface;

import java.util.Scanner;

public class Product implements Cloneable
{
    int pId;
    String pName;
    double pCost;
    public Product (int pId, String pName, double pCost)
    {
        this.pId = pId;
        this.pName = pName;
        this.pCost = pCost;
    }
    public void showDetail()
    {
        System.out.println("Product ID: "+pId);
        System.out.println("Product Name: "+pName);
        System.out.println("Product Cost: "+pCost);
    }
    public static void main (String[] args) throws CloneNotSupportedException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int pId = sc.nextInt();
        System.out.print("Enter product name: ");
        String pName = sc.next();
        System.out.print("Enter product Cost: ");
        double pCost = sc.nextDouble();
        System.out.println("-------Product Detail--------");
        Product p1 = new Product(pId, pName, pCost);
        Product p2 = (Product) p1.clone();
        p2.showDetail();
    }
}