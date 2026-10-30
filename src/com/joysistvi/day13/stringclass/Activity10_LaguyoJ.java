package com.joysistvi.day13.stringclass;

/*
 * Activity 10 - Java String Method: replace()
 * Student: Laguyo, J.
 *
 * Note: The main method is placed directly inside the main class
 * (Activity10_LaguyoJ) so Java can execute it without requiring
 * a static inner class wrapper.
 */
public class Activity10_LaguyoJ {

    public static void main(String[] args) {
        // Sample original string used for demonstration
        String originalText = "Java is hard, but Java is fun!";

        // -----------------------------------------------------------------
        // 1. REPLACING A SPECIFIC WORD / SUBSTRING
        // -----------------------------------------------------------------
        // replace(target, replacement) finds exact matching text and swaps it.
        // String immutability: originalText remains unchanged; a new string is returned.
        String updatedText = originalText.replace("hard", "easy");
        System.out.println("Modified Word: " + updatedText);
        // Output: Java is easy, but Java is fun!

        // -----------------------------------------------------------------
        // 2. REPLACING ALL OCCURRENCES OF A WORD
        // -----------------------------------------------------------------
        // replace() automatically replaces EVERY instance of the target sequence across the entire string.
        String replaceAllJava = originalText.replace("Java", "Coding");
        System.out.println("Replaced All:  " + replaceAllJava);
        // Output: Coding is hard, but Coding is fun!

        // -----------------------------------------------------------------
        // 3. REPLACING INDIVIDUAL CHARACTERS
        // -----------------------------------------------------------------
        // replace(oldChar, newChar) can also take single char primitives (in single quotes).
        // Common use case: formatting dates, file paths, or delimiter characters.
        String dashedDate = "2026/10/30".replace('/', '-');
        System.out.println("Formatted Date: " + dashedDate);
        // Output: 2026-10-30
    }
}
