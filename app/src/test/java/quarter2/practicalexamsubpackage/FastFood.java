package quarter2.practicalexamsubpackage;

import java.util.Scanner;

class FastFood {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\n=== FAST FOOD MENU ===");
            System.out.println("1. Order Burger");
            System.out.println("2. Order Fries");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nChoose Burger Option:");
                    System.out.println("1. Combo");
                    System.out.println("2. Solo");
                    System.out.print("Enter choice: ");

                    int burgerChoice = scanner.nextInt();

                    if (burgerChoice == 1) {
                        System.out.println("Burger Combo selected.");
                    } else if (burgerChoice == 2) {
                        System.out.println("Solo Burger selected.");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    System.out.println("Fries added to your order.");
                    break;

                case 3:
                    System.out.println("Thank you for ordering!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
