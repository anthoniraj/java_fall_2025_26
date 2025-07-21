package edu.vit.corejava.basics;

public class FormatSpecifier {
    public static void main(String[] args) {
        String studentName = "Arjun Kumar Raja";
        int age = 20;
        double cgpa = 8.4567;
        double attendancePercent = 92.348;

        // Basic formatting
        System.out.printf("Name        : %s%n", studentName);
        System.out.printf("Age         : %d%n", age);

        // Format to 2 decimal places (%.2f)
        System.out.printf("CGPA        : %.2f%n", cgpa); // prints 8.46

        // Format to 1 decimal place
        System.out.printf("Attendance  : %.1f%%%n", attendancePercent); // prints 92.3%

        // Aligning with field width
        System.out.printf("%-12s: %-10s%n", "Student", studentName); // left-aligned
        System.out.printf("%-12s: %10.2f%n", "Final Marks", 187.6789); // right-aligned, 2 decimal
    }
}
