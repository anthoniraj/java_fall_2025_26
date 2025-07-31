package edu.vit.corejava.looping;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int enteredPin;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your 4-digit ATM PIN: ");
            enteredPin = sc.nextInt();
            attempts++;

            if (enteredPin != CORRECT_PIN) {
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
            }

        } while (enteredPin != CORRECT_PIN && attempts < 3);

        if (enteredPin == CORRECT_PIN) {
            System.out.println("PIN verified. Welcome!");
        } else {
            System.out.println("Your card is temporarily blocked. Please contact the bank.");
        }
        sc.close();
    }
}

