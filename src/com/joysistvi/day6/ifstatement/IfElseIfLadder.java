package com.joysistvi.day6.ifstatement;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int day = 1;
        String dayName;

        if (day == 1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is 2
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is 5
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is 6
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is 7
            dayName = "Saturday";
        } else {
            // Executes when the day number is invalid
            dayName = "Invalid Day";
        }

        System.out.println(dayName);
    }
}