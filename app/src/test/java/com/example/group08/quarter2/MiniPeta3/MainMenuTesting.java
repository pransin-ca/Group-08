package com.example.group08.quarter2.MiniPeta3;

import java.util.Scanner;
import java.io.ByteArrayInputStream;
public class MainMenuTesting {
    public void mainMenu(Scanner input) {
        int choice;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Profile");
            System.out.println("2. Grades");
            System.out.println("3. Quizzes");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();
            System.out.println(choice);

            switch (choice) {
                case 1:
                    Profile profile = new Profile();
                    profile.viewProfile("Juan", "11-St. Carlo," "123456", 15);
                    break;
                case 2:
                    Grades grades = new Grades();
                    grades.viewGrades();
                    break;
                case 3:
                    Schedule schedule = new Schedule();
                    schedule.viewSchedule();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("ERROR: Invalid action.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        StringBuilder simulatedUserInput = new StringBuilder();
        simulatedUserInput.append("1\n");
        simulatedUserInput.append("2\n");
        simulatedUserInput.append("3\n");
        simulatedUserInput.append("4\n");

        System.setIn(new ByteArrayInputStream(simulatedUserInput.toString().getBytes()));

        Scanner input = new Scanner(System.in);
        MainMenuTesting menu = new MainMenuTesting();
        menu.mainMenu(input);
    }
}


