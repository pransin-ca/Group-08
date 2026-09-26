package com.example.group08.quarter2.MiniPeta3;

public class GymAccess {

    public void checkGymAccess(String studentName, String gradeLevel, String section, String studentID, boolean status) {
        System.out.println("=== GYM ACCESS AND INFORMATION ===");
        System.out.println("Name: " + studentName);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Section: " + section);
        System.out.println("Student ID: " + studentID);

        if (status) {
            System.out.println("Status: Access Granted");
        } else {
            System.out.println("Status: Access Denied");
        }
    }
}
