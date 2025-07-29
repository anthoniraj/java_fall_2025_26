package edu.vit.corejava.practice;

import java.util.Scanner;

/**
 * Mandy is a software engineer working on a program to analyze two integers based on specific conditions using a logical operator. 
 * She needs to determine  if both integers are odd or if at least one of them is divisible by 7.
 * Depending on the result, she wants to print different messages.
 * - If the condition is met, the program should identify and print the first number that is divisible by 7 or indicate that both numbers are odd.
 * - If the condition is not met, the program should print a message indicating the condition was not met, along with the input numbers.
 * Input Format :
 * - The first line of input consists of an integer representing the first input number.
 * - The second line consists of an integer representing the second input number.
 * Output Format :
 * - The output displays "Condition met: " followed by an integer representing the first number divisible by 7, or prints "Both numbers are odd" if the two inputs are odd.
 * - If the condition is not met, it displays "Conditions not met: " followed by the two input integers, separated by a space.
 */

public class TernaryDemo {
        public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();

        boolean isConditionMet = (firstNumber % 2 != 0 && secondNumber % 2 != 0)
                              || (firstNumber % 7 == 0 || secondNumber % 7 == 0);

        String resultMessage = isConditionMet 
            ? "Condition met: " + (firstNumber % 7 == 0
                ? firstNumber 
                : (secondNumber % 7 == 0 
                    ? secondNumber 
                    : "Both numbers are odd"))
            : "Conditions not met: " + firstNumber + " " + secondNumber;

        System.out.println(resultMessage);

        inputScanner.close();
    }
}
