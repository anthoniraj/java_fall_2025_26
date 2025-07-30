package edu.vit.corejava.operators;

public class ShiftOperators {
    public static void main(String[] args) {
        int a = 8; // Binary: 1000
        int leftShift = a << 2; // Shift left by 2 bits
        System.out.println("Left Shift (8 << 2): " + leftShift); // Output: 32 (Binary: 100000)

        int rightShift = a >> 2; // Shift right by 2 bits
        System.out.println("Right Shift (8 >> 2): " + rightShift); // Output: 2 (Binary: 10)
    }
}
