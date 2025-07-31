package edu.vit.corejava.basics;

public class WrapperClass{
    public static void main(String[] args) {
        Integer x = 10; // Auto boxing
        System.out.println(x + 5); // Output: 15
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int y = 10; // Unboxing
        System.out.println(y);
    }
}