package edu.vit.corejava.basics;

public class FormattedOutput {
    public static void main(String[] args) {
        int numberOfStudents = 50;
        String hodName = "Dr. Gopinath";
        final int MAX_WORKING_DAYS = 80;
        boolean hasPaidFees = true;
        var city = "Vellore";

        System.out.printf("Students   : %d%n", numberOfStudents);
        System.out.printf("HoD Name   : %s%n", hodName);
        System.out.printf("Max Days   : %d%n", MAX_WORKING_DAYS);
        System.out.printf("Fees Paid? : %b%n", hasPaidFees);
        System.out.printf("City       : %s%n", city);
    }
}
