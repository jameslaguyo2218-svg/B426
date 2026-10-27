package com.joysistvi.day11.singlearray;

import java.util.Scanner;

public class Activity8_LaguyoJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Input loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nYou entered:");

        // Variables for sum, highest, and lowest
        int sum = 0;
        int highest = numbers[0];
        int lowest = numbers[0];

        // Display entered numbers and calculate metrics
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);

            sum += numbers[i];

            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Calculate average as a double for decimal precision
        double average = (double) sum / numbers.length;

        // Display results matching the expected output format
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // Stretch Goal: Highest and Lowest values
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);

        scanner.close();
    }
}