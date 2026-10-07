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
}