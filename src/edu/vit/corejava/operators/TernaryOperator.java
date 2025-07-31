package edu.vit.corejava.operators;
/**
 * Demonstrates the use of the ternary operator in Java.
 * The ternary operator is a shorthand for the if-else statement and is used to evaluate
 * a boolean expression and return one of two values based on the result.
 * @author Anthoniraj Amalanathan
 * @version 1.0
 * @since 2025-07-28
 */

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max); // Output: 20
        
        // Using ternary operator to check if a number is even or odd
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(a + " is: " + result); // Output: Even
    }
}
