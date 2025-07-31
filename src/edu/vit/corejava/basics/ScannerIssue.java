package edu.vit.corejava.basics;

import java.util.Scanner;


public class ScannerIssue {
   public static void main(String[] args) {
    int a = Math.abs(20);
   //  double squareRoot = Math.sqrt(3);
   //  int maxValue = Math.max(1, 2);
   //  int minValue = Math.min(10,2);
    

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Age: ");
    int age = sc.nextInt();
    System.out.println("Age is "+ age);
    // Required for reading newline from previous input
    sc.nextLine();
    System.out.println("Enter Name: ");
    String name = sc.nextLine();
    System.out.println("Welcome "+ name);
    sc.close();
   }

}
