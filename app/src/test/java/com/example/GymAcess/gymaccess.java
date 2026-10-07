package com.example.GymAcess;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class gymaccess {

    @Test
        public void Gymaccess() {

        // Automated user input
        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING GYM TEST DATA ---");

        // Step 1: Enter gym floor
        automatedInput.append("1\n");

        // Step 2: VIP membership - Level 1
        automatedInput.append("2\n"); // Vhoose Hire Trainer
        automatedInput.append("1\n"); // Level 1

        // Step 3: Basic membership - Level 2
        automatedInput.append("2\n"); // Choose Hire Trainer
        automatedInput.append("2\n"); // Level 2

        // Step 4: Exit
        automatedInput.append("3\n");

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        // Replace keyboard input with automated input
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(
                        automatedInput.toString().getBytes(StandardCharsets.UTF_8)
                );

        Scanner scanner = new Scanner(inputStream);

        // Capture program output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        System.setOut(new PrintStream(outputStream));

        try {
            // Run the gym system
            GymAccess gymSystem = new GymAccess();
            gymSystem.start(scanner);

        } finally {
            // Restore normal console output
            System.setOut(originalOutput);
        }

        // Get the output produced by GymAccess
        String output = outputStream.toString();

        // Display captured output
        System.out.println("--- GYM SYSTEM OUTPUT ---");
        System.out.println(output);

        // Assertions
        assertTrue(
                "Expected 'Trainer Assigned' message was not found.",
                output.contains("Trainer Assigned")
        );

        assertTrue(
                "Expected 'Upgrade Required' message was not found.",
                output.contains("Upgrade Required")
        );

        System.out.println("--- TEST PASSED ---");
    }

    private static class GymAccess {
        private Scanner scanner;

        public void start(Scanner scanner) {
            this.scanner = scanner;
        }
    }
}


