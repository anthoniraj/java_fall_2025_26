package edu.vit.corejava.basics;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Your age is: "+age);

        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Welcome "+ name);

    }
}
