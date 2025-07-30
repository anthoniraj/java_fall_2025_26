package edu.vit.corejava.operators;

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
