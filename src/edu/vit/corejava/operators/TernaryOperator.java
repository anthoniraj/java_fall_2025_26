package edu.vit.corejava.operators;

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
