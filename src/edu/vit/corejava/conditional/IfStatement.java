package edu.vit.corejava.conditional;

public class IfStatement {
    public static void main(String[] args) {
        // ATM Balance Check
        double balance = 5000;
        if (balance > 0) {
            System.out.println("Withdrawal possible");
        }

        // Traffic Signal Detection
        boolean redLight = true;
        if (redLight) {
            System.out.println("Stop the vehicle");
        }
    }
}
