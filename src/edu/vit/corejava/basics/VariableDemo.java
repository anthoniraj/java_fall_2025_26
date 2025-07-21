package edu.vit.corejava.basics;
/**
 * This is a sample program for demonstrating 
 * Java Data Types and Variables
 * @author Anthoniraj
 * @version 1.0
 * @since 21-07-2025  
 */

public class VariableDemo {
    public static void main(String[] args) {
        int numberOfStudents = 50;
        String hodName = "Dr. Gopinath";
        final int MAX_WORKING_DAYS = 80;
        boolean hasPaidFees = true;
        var city = "Vellore";

        System.out.println("Students: " + numberOfStudents);
        System.out.println("HoD Name: " + hodName);
        System.out.println("Max Days: " + MAX_WORKING_DAYS);
        System.out.println("Fees Paid? " + hasPaidFees);
        System.out.println("City: " + city);
    }
}
