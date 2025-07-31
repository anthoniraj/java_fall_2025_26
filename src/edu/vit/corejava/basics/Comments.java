package edu.vit.corejava.basics;
/**
 * This is documentation comment
 * <p>This is the sample program for wrapper class</p>
 * @author Anthoniraj
 * @since 21-07-2025
 * @version 1.0
 * 
 */

public class Comments {
    public static void main(String[] args) {
        // Single Line Comment 
        System.out.println("Test");     
        System.out.println(add(10, 20)); // This is inline comment 
    }

    /**
     * This is a method to add two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    private static int add (int a, int b){
        // This is a method to add two numbers       
        return a+b; 
    }
}
