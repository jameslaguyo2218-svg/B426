package com.joysistvi.day13.stringclass;

/*
 * Activity 11 - Java Math Methods Research & Examples
 * Student: Laguyo, J.
 *
 * Description:
 * Demonstrates the 15 required standard Java Math utility methods
 * with clear descriptions and simple examples for each.
 */
public class Activity11_LaguyoJ {

    public static void main(String[] args) {
        System.out.println("=== JAVA MATH METHODS DEMO ===\n");

        // -----------------------------------------------------------------
        // 1. Math.abs()
        // Returns the absolute (positive) value of a number.
        // -----------------------------------------------------------------
        int negativeNum = -25;
        int absResult = Math.abs(negativeNum);
        System.out.println("1. Math.abs(-25)       -> " + absResult); // 25

        // -----------------------------------------------------------------
        // 2. Math.max()
        // Returns the greater (maximum) of two values.
        // -----------------------------------------------------------------
        int maxResult = Math.max(45, 89);
        System.out.println("2. Math.max(45, 89)    -> " + maxResult); // 89

        // -----------------------------------------------------------------
        // 3. Math.min()
        // Returns the smaller (minimum) of two values.
        // -----------------------------------------------------------------
        int minResult = Math.min(45, 89);
        System.out.println("3. Math.min(45, 89)    -> " + minResult); // 45

        // -----------------------------------------------------------------
        // 4. Math.pow()
        // Returns the value of the first argument raised to the power of the second (base^exponent).
        // -----------------------------------------------------------------
        double powResult = Math.pow(2, 3);
        System.out.println("4. Math.pow(2, 3)      -> " + powResult); // 8.0

        // -----------------------------------------------------------------
        // 5. Math.sqrt()
        // Returns the correctly rounded positive square root of a double value.
        // -----------------------------------------------------------------
        double sqrtResult = Math.sqrt(64);
        System.out.println("5. Math.sqrt(64)       -> " + sqrtResult); // 8.0

        // -----------------------------------------------------------------
        // 6. Math.round()
        // Rounds a floating-point number to the nearest integer/long.
        // -----------------------------------------------------------------
        long roundResult = Math.round(5.67);
        System.out.println("6. Math.round(5.67)    -> " + roundResult); // 6

        // -----------------------------------------------------------------
        // 7. Math.ceil()
        // Rounds a double value UP to the nearest integer value (ceiling).
        // -----------------------------------------------------------------
        double ceilResult = Math.ceil(4.12);
        System.out.println("7. Math.ceil(4.12)     -> " + ceilResult); // 5.0

        // -----------------------------------------------------------------
        // 8. Math.floor()
        // Rounds a double value DOWN to the nearest integer value (floor).
        // -----------------------------------------------------------------
        double floorResult = Math.floor(4.89);
        System.out.println("8. Math.floor(4.89)    -> " + floorResult); // 4.0

        // -----------------------------------------------------------------
        // 9. Math.random()
        // Returns a pseudorandom double value between 0.0 (inclusive) and 1.0 (exclusive).
        // -----------------------------------------------------------------
        double randomVal = Math.random();
        System.out.println("9. Math.random()       -> " + randomVal);

        // -----------------------------------------------------------------
        // 10. Math.log()
        // Returns the natural logarithm (base e) of a double value.
        // -----------------------------------------------------------------
        double logResult = Math.log(Math.E);
        System.out.println("10. Math.log(e)        -> " + logResult); // 1.0

        // -----------------------------------------------------------------
        // 11. Math.log10()
        // Returns the base 10 logarithm of a double value.
        // -----------------------------------------------------------------
        double log10Result = Math.log10(1000);
        System.out.println("11. Math.log10(1000)   -> " + log10Result); // 3.0

        // -----------------------------------------------------------------
        // 12. Math.exp()
        // Returns Euler's number e raised to the power of a double value (e^x).
        // -----------------------------------------------------------------
        double expResult = Math.exp(1);
        System.out.println("12. Math.exp(1)        -> " + expResult); // ~2.71828

        // -----------------------------------------------------------------
        // 13. Math.sin()
        // Returns the trigonometric sine of an angle given in radians.
        // -----------------------------------------------------------------
        double radians30 = Math.toRadians(30);
        double sinResult = Math.sin(radians30);
        System.out.println("13. Math.sin(30 deg)   -> " + sinResult); // 0.5

        // -----------------------------------------------------------------
        // 14. Math.cos()
        // Returns the trigonometric cosine of an angle given in radians.
        // -----------------------------------------------------------------
        double radians60 = Math.toRadians(60);
        double cosResult = Math.cos(radians60);
        System.out.println("14. Math.cos(60 deg)   -> " + cosResult); // ~0.5

        // -----------------------------------------------------------------
        // 15. Math.tan()
        // Returns the trigonometric tangent of an angle given in radians.
        // -----------------------------------------------------------------
        double radians45 = Math.toRadians(45);
        double tanResult = Math.tan(radians45);
        System.out.println("15. Math.tan(45 deg)   -> " + tanResult); // 1.0
    }
}