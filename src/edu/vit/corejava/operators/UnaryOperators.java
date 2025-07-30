package edu.vit.corejava.operators;

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
