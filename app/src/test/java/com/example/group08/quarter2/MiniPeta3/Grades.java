package com.example.group08.quarter2.MiniPeta3;

public class Grades {
    public void viewGrades(int english, int math, int filipino, int science, int history) {

        int totalGrade = english + math + filipino + science + history;
        int average = totalGrade / 5;

        System.out.println("=== GRADES ===");
        System.out.println("English: " + english);
        System.out.println("Math: " + math);
        System.out.println("Filipino: " + filipino);
        System.out.println("Science: " + science);
        System.out.println("History: " + history);
        System.out.println("AVERAGE: " + average);

        if (average >= 98) {
            System.out.println("=== WITH HIGHEST HONORS");
        } else if (average <= 97 && average >= 95) {
            System.out.println("=== WITH HIGH HONORS ===");
        } else if (average <= 94 && average >= 90) {
            System.out.println("=== WITH HONORS ===");
        } else if (average <= 89 && average >= 75) {
            System.out.println("=== PASSED ===");
        } else {
            System.out.println("FAILED!");
        }
    }
}
