package com.joysistvi.day5.operator;

public class TernaryOperator {
    public static void main(String[] args) {
        // (conditon) ? true block : false block;

        //example 1:

        int age = 18;

        String result = (age >= 18) ? "valid age" : "Invalid Age";
        System.out.println(result);

        //example 2:

        int num = 10;
        int num2 = 20;

        int bigger = (num > num2) ? num: num2;
        System.out.println(bigger);

        //example 3:

        int number = 2;

        boolean isEvenNumber = number % 2 == 0;
        System.out.println(isEvenNumber);

    }
}
