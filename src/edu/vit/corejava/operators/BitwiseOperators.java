package edu.vit.corejava.operators;
/**
 * BitwiseOperators.java
 * This class demonstrates the use of bitwise operators in Java.
 * Bitwise operators perform operations on bits and are used for low-level programming tasks.
 * Bitwise AND (&), OR (|), XOR (^), and NOT (~) are commonly used operators.
 * @author Anthoniraj Amalanathan
 * @version 1.0
 * @since 2025-07-28 
 */

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 10; // 1010 in binary
        int b = 5;  // 0101 in binary

        // Bitwise AND
        System.out.println("a & b: " + (a & b)); // Output: 0 (0000 in binary)

        // Bitwise OR
        System.out.println("a | b: " + (a | b)); // Output: 15 (1111 in binary)

        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b)); // Output: 15 (1111 in binary)

        // Bitwise NOT -(a+1)
        System.out.println("~a: " + (~a)); // Output: -11 (inverts all bits)
    }
}
