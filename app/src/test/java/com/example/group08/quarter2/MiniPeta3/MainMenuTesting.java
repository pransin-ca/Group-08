package com.example.group08.quarter2.MiniPeta3;

import java.util.Scanner;
import java.io.ByteArrayInputStream;
public class MainMenuTesting {
    public void mainMenu(Scanner input) {
        int choice;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Profile");
            System.out.println("2. Attendance");
            System.out.println("3. Grades");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();
            System.out.println(choice);

            switch (choice) {
                case 1:
                    Profile profile = new Profile();
                    profile.viewProfile("Juan", "11-St. Carlo", "Ma'am Claire", "123456", 15);
                    break;
                case 2:
                    Grades grades = new Grades();
                    grades.viewGrades(95, 92, 93, 99, 91);
                    break;
                case 3:
                    Attendance attendance = new Attendance();
                    attendance.viewAttendance(20, 10, 5);
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
        String simulatedUserInput = "1\n" +
                "2\n" +
                "3\n" +
                "4\n";

        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        Scanner input = new Scanner(System.in);
        MainMenuTesting menu = new MainMenuTesting();
        menu.mainMenu(input);
    }
}


