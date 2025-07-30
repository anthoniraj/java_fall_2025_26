package edu.vit.corejava.operators;
/**
 * RelationalOperators demonstrates the use of relational operators in Java.
 * Relational operators are used to compare two values and return a boolean result.
 * Relational operators include greater than (>), less than (<), greater than or equal to (>=),
 * less than or equal to (<=), equal to (==), and not equal to (! * =).
 * @author Anthoniraj Amalanathan
 * @version 1.0
 * @since 2025-07-28
 */

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("a > b: " + (a > b)); // Output: true
        System.out.println("a < b: " + (a < b)); // Output: false
        System.out.println("a >= b: " + (a >= b)); // Output: true
        System.out.println("a <= b: " + (a <= b)); // Output: false
        System.out.println("a == b: " + (a == b)); // Output: false
        System.out.println("a != b: " + (a != b)); // Output: true
    }
}
