package com.joysistvi.day4.operator;

public class Activity2_LaguyoJ {
    public static void main(String[] args) {
        //  System.out.println("hello world");

        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        int percent = 100;

        double sum = income + foodAllowance + transportation + rent + utilityBill;
        double foodPercentage = foodAllowance / income * percent;
        double transpoPercentage = transportation / income * percent;
        double rentPercentage = rent / income * percent;
        double utilityPercentage = utilityBill / income * percent;
        double remainingBal = income - (foodAllowance + transportation + rent + utilityBill);

        String title = "* Expense Tracker Program *";

        //calculate the percentage of each expense relative to the total income

        System.out.println(title);

        System.out.printf("Income: %1f%%%n", income);
        System.out.printf("Food Allowance: %.1f%%%n", foodPercentage);
        System.out.printf("Transportation: %.1f%%%n", transpoPercentage);
        System.out.printf("Rent:%.1f%%%n", rentPercentage);
        System.out.printf("Utility Bill: %.1f%%%n", utilityPercentage);


        //Calculate and display the remaining balance after deducting all the expenses from the income.

        System.out.printf("Remaining Balance: %.0f%n", remainingBal);


    }
}