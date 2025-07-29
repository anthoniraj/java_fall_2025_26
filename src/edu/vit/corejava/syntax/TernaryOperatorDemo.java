package edu.vit.corejava.syntax;


public class TernaryOperatorDemo {
    public static void main(String[] args) {
        String day = "Sunday";
        String status = (day.equals("Sunday")) ? "Holiday" : "Workday";
        System.out.println(status); // Output: Holiday

        double total = 900;
        String gift = (total > 1000) ? "Free Mug" : "No gift";
        System.out.println(gift); // Output: No gift
    }
}
