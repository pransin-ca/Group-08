package com.example.group08.quarter2.MiniPeta3.PracticalExam.FastFoodTest;

import java.util.Scanner;

public class FastFoodMenuTesting {

    public void start(Scanner scanner) {
        int choice;

        do {
            System.out.println("\n==== FAST FOOD MENU ====");
            System.out.println("1. Order burger");
            System.out.println("2. Order fries");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    orderBurger(scanner);
                    break;

                case 2:
                    orderFries();
                    break;

                case 3:
                    System.out.println("Exiting. Thank you for ordering!");
                    break;

                default:
                    System.out.println("Invalid. Try again.");
            }

        } while (choice != 3);
    }

    // This is INSIDE FastFoodMenu
    private void orderBurger(Scanner scanner) {
        System.out.println("\n==== BURGER OPTIONS ====");
        System.out.println("1. Combo - ₱150");
        System.out.println("2. Solo - ₱100");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You ordered a Burger Combo - ₱150");
                System.out.println("Includes: Burger + Fries + Soft Drink");
                break;

            case 2:
                System.out.println("You ordered a Burger Solo - ₱100");
                System.out.println("Includes: Burger only");
                break;

            default:
                System.out.println("Invalid burger option.");
        }
    }

    private void orderFries() {
        System.out.println("\nYou ordered Fries - ₱60");
        System.out.println("Thank you!");
    }
}