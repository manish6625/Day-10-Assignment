package com.codegnan.controlstatements;

import java.util.Scanner;

public class Advancedcanteen {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed prices
        final int TEA_PRICE = 10;
        final int COFFEE_PRICE = 15;
        final int SAMOSA_PRICE = 20;

        // Order quantities
        int teaQty = 0, coffeeQty = 0, samosaQty = 0;

        int choice;
        double subtotal, tax, total;

        // Main menu loop
        do {
            System.out.println("\n||=========== CANTEEN MENU ===========||");
            System.out.println("1. View Menu");
            System.out.println("2. Order Items");
            System.out.println("3. View Bill");
            System.out.println("4. Checkout and Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // View Menu
                    System.out.println("\n--- MENU ---");
                    System.out.println("1. Tea     - ₹10");
                    System.out.println("2. Coffee  - ₹15");
                    System.out.println("3. Samosa  - ₹20");
                    break;

                case 2:
                    // Order Items
                    System.out.print("Enter item number to order (1-3): ");
                    int item = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    if (qty <= 0) {
                        System.out.println("Quantity must be greater than 0.");
                        break;
                    }

                    switch (item) {
                        case 1:
                            teaQty += qty;
                            System.out.println(qty + " Tea(s) added.");
                            break;

                        case 2:
                            coffeeQty += qty;
                            System.out.println(qty + " Coffee(s) added.");
                            break;

                        case 3:
                            samosaQty += qty;
                            System.out.println(qty + " Samosa(s) added.");
                            break;

                        default:
                            System.out.println("Invalid item number.");
                    }
                    break;

                case 3:
                    // View Bill
                    System.out.println("\n--- BILL ---");
                    subtotal = 0;

                    if (teaQty > 0) {
                        System.out.println("Tea x" + teaQty + " = ₹" + (teaQty * TEA_PRICE));
                        subtotal += teaQty * TEA_PRICE;
                    }
                    if (coffeeQty > 0) {
                        System.out.println("Coffee x" + coffeeQty + " = ₹" + (coffeeQty * COFFEE_PRICE));
                        subtotal += coffeeQty * COFFEE_PRICE;
                    }
                    if (samosaQty > 0) {
                        System.out.println("Samosa x" + samosaQty + " = ₹" + (samosaQty * SAMOSA_PRICE));
                        subtotal += samosaQty * SAMOSA_PRICE;
                    }

                    if (subtotal == 0) {
                        System.out.println("No items ordered yet.");
                    } else {
                        tax = subtotal * 0.05;
                        total = subtotal + tax;
                        System.out.println("Subtotal = ₹" + subtotal);
                        System.out.println("Tax (5%) = ₹" + tax);
                        System.out.println("Total = ₹" + total);
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you! Exiting system");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}