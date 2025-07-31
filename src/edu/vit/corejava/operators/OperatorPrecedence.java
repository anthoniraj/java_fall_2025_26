package edu.vit.corejava.operators;
/**
 * Demonstrates operator precedence in Java.
 * Operator precedence determines the order in which operators are evaluated in expressions.
 * This class shows how different operators interact based on their precedence.
 * @author Anthoniraj Amalanathan
 * @version 1.0
 * @since 2025-07-28
 */

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        // Demonstrating operator precedence
        int result = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * c: " + result); // Output: 20

        result = (a + b) * c; // Parentheses change the precedence
        System.out.println("Result of (a + b) * c: " + result); // Output: 30
    }
}
