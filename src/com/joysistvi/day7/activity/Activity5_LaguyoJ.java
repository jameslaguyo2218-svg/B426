package com.joysistvi.day7.activity;

import java.util.Scanner;

public class Activity5_LaguyoJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ussdCode = "";

        System.out.println("Dial *143# to access Globe services.");

        while (true) {

            System.out.print("Enter USSD Code: ");
            ussdCode = input.nextLine();

            // Early exit using return
            if (ussdCode.equalsIgnoreCase("exit")) {
                System.out.println("Program terminated. Goodbye!");
                input.close();
                return;
            }

            // Validate USSD code
            if (ussdCode.equals("*143#")) {
                System.out.println("USSD Code accepted!");
                System.out.println("Accessing Globe services...");
                input.close();
                return;
            } else {
                System.out.println("Error! Invalid USSD code.");
                System.out.println("Please try again.");
            }
        }
    }
}
