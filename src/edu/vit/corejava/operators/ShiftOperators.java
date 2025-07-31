package edu.vit.corejava.operators;
/**
 * ShiftOperators demonstrates the use of shift operators in Java.
 * Shift operators are used to shift the bits of a number to the left or right.
 * Left shift (<<) moves bits to the left, effectively multiplying the number by 2 for each shift.
 * Right shift (>>) moves bits to the right, effectively dividing the number by 2 for each shift.
 * @author Anthoniraj Amalanathan
 * @version 1.0
 * @since 2025-07-28
 */

public class ShiftOperators {
    public static void main(String[] args) {
        int a = 8; // Binary: 1000
        int leftShift = a << 2; // Shift left by 2 bits
        System.out.println("Left Shift (8 << 2): " + leftShift); // Output: 32 (Binary: 100000)

        int rightShift = a >> 2; // Shift right by 2 bits
        System.out.println("Right Shift (8 >> 2): " + rightShift); // Output: 2 (Binary: 10)
    }
}
