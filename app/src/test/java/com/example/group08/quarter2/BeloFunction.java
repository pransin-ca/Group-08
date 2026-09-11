package com.example.group08.quarter2;

import org.junit.Test;
public class BeloFunction {

    @Test
    public void printMyProfile () {
        String myName = "Belo";
        String petName = "Meatball";
        String favFood = "Adobo";
        int myAge = 18;

        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + " and I am " + myAge + " years old.");
        System.out.println("I have a wonderful pet named " + petName + ".");
        System.out.println("If I could, I would eat " + favFood + " every single day.");
    }
}
