package com.example.group08.quarter2.MiniPeta3;

import java.util.Scanner;
import java.io.ByteArrayInputStream;
import org.junit.Test;

public class MainMenuTesting {
    public void mainMenu(Scanner input) {
        int choice;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Profile");
            System.out.println("2. Grades");
            System.out.println("3. Attendance");
            System.out.println("4. Gym Access");
            System.out.println("5. Exit");

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
                    attendance.viewAttendance(29, 2, 2);
                    break;
                case 4:
                    GymAccess gym = new GymAccess();
                    gym.checkGymAccess("Juan", "11-St. Carlo", "Ma'am Claire", "123456", true);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("ERROR: Invalid action.");
            }
        } while (choice != 5);
    }

    @Test
    public void testMainMenu() {
        StringBuilder simulatedUserInput = new StringBuilder();
        simulatedUserInput.append("1\n");
        simulatedUserInput.append("2\n");
        simulatedUserInput.append("3\n");
        simulatedUserInput.append("4\n");
        simulatedUserInput.append("5\n");


        System.setIn(new ByteArrayInputStream(simulatedUserInput.toString().getBytes()));

        Scanner input = new Scanner(System.in);
        MainMenuTesting menu = new MainMenuTesting();
        menu.mainMenu(input);
    }
}


