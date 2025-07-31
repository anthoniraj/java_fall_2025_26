package edu.vit.corejava.operators;
/**
 * This class demonstrates the use of unary operators in Java.
 * Unary operators operate on a single operand and include unary plus, unary minus,
 * increment, and decrement operators.
 * Unary plus (+) does not change the value, while unary minus (-) negates it.
 * Increment (++) increases the value by 1, and decrement (--) decreases it by
 * @author Anthoniraj Amalanathan
 * @version 1.0
 * @since 2025-07-28
 */

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;

        // Unary plus operator
        System.out.println("Unary plus: " + (+a)); // Output: 5

        // Unary minus operator
        System.out.println("Unary minus: " + (-a)); // Output: -5

        // Pre Increment operator
        System.out.println("Increment: " + (++a)); // Output: 6
        System.out.println("After increment, a: " + a); // Output: 6

        // Pre Decrement operator
        System.out.println("Decrement: " + (--a)); // Output: 5
        System.out.println("After decrement, a: " + a); // Output: 5

        // Post Increment operator
        System.out.println("Post Increment: " + (a++)); // Output: 5
        System.out.println("After post increment, a: " + a); // Output: 6

        // Post Decrement operator
        System.out.println("Post Decrement: " + (a--)); // Output: 6
        System.out.println("After post decrement, a: " + a); // Output: 5

    }
}
