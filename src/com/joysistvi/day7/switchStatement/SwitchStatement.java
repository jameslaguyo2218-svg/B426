package com.joysistvi.day7.switchStatement;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 3;
        String dayName = "";

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
        }

        System.out.println("Today is " + dayName);

        //NOTE: bawal: boolen, long, float, double
        //Pwede: byte, short, int, enum
    }
}
