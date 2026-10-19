package com.joysistvi.day4.operator;

public class UnaryOperator {
    public static void main(String[] args) {

        int num = 10;
        System.out.println(-num); //negating value

        boolean isActive = false;
        System.out.println(!isActive); //negating boolean value

        int num2 = 90;
        System.out.println(++num2); //increment/decrememnt of value by one
        System.out.println(--num2);
        System.out.println(++num2);

        //or in also be
        System.out.println(num2 - 1);

        //post-increment
        int num3 = 20;
        System.out.println(num3--);
        System.out.println(num3);


    }
}
