package edu.vit.corejava.basics;

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
