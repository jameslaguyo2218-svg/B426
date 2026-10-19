package com.joysistvi.day5.operator;

public class LogicalOperator {
    public static void main(String[] args) {
        //compound Conditional Statement - 2 conditions in one statement

        int age = 15;

        //13 - 17

        boolean isJuniorHigh = age >= 13 && age <=17;
        boolean isAdult = (age < 18);

        System.out.println(isJuniorHigh);
        System.out.println(isAdult);

        int num = 10;
        int num2 = 20;


        System.out.println(num > num2 && num < num2); //&& (logical and) same as || (logical or) (shift \)
        System.out.println(num > num2 || num < num2);


    }
}
