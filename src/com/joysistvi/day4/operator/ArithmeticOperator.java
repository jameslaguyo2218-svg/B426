package com.joysistvi.day4.operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "Hello";
        String name2 = "Jenny";

        System.out.println("Hello" + ", " + name2);

        //Arithmetic Operator

        int number = 28;
        int number2 = 32;
        int number3 = 67;

        String answer = "Final Answer";

        System.out.println(answer + ": " + (number + number2) * number3);

        int num = 20;
        int num2 = 3;
        
        int sum = num + num2;
        int difference = num - num2;
        int product = num * num2;
        int quotient = num / num2;
        double decimal = (double) num / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("With Decimal" + decimal);


        int num3 = 53;
        int num4 = 6;
        int remainder = num3 % num4;
        System.out.println("remainder:" + remainder);








    }
}