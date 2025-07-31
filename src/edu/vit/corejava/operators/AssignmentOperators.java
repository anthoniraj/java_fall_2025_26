package edu.vit.corejava.operators;
/**
 * This class demonstrates the use of assignment operators in Java.
 * It includes basic assignment and compound assignment operations.
 * Assignment operators are used to assign values to variables.
 * @author Anthoniraj Amalanathan
 * @version 1.0
 * @since 2025-07-28
 */

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Assignment operator
        a = b; // a is now 5
        System.out.println("After assignment, a: " + a); // Output: 5

        // Compound assignment operators
        a += b; // a = a + b
        System.out.println("After +=, a: " + a); // Output: 10

        a -= b; // a = a - b
        System.out.println("After -=, a: " + a); // Output: 5

        a *= b; // a = a * b
        System.out.println("After *=, a: " + a); // Output: 25

        a /= b; // a = a / b
        System.out.println("After /=, a: " + a); // Output: 5

        a %= b; // a = a % b
        System.out.println("After %=, a: " + a); // Output: 0
    }
}
