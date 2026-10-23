package com.joysistvi.day9.looping.activity;

import java.util.Scanner;

public class Activity6_LaguyoJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ask the user for a number

        System.out.print("Enter the multiplication table you want to display: ");
        int number = scanner.nextInt(); // Changed 'input' to 'scanner'

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close(); // Changed 'input' to 'scanner'
    }
}