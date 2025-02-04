package com.programmersio.javabasics.week3day2.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

public class ShoppingCart {
    private ArrayList<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(Item item) {
        cart.add(item);
        System.out.println(item.name + " added to the cart.");
    }

    public void removeItem(String itemName) {
        for (Item item : cart) {
            if (item.name.equalsIgnoreCase(itemName)) {
                cart.remove(item);
                System.out.println(item.name + " removed from the cart.");
                return;
            }
        }
        System.out.println("Item not found in the cart.");
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Item item : cart) {
                System.out.println(item);
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : cart) {
            total += item.price;
        }
        return total;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add item\n2. Remove item\n3. Display cart\n4. Calculate total\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    cart.addItem(new Item(name, price));
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemName = scanner.nextLine();
                    cart.removeItem(itemName);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Total cost: $" + cart.calculateTotal());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }
        }
    }
}
