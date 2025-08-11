package edu.vit.corejava.practice;

import java.util.Scanner;

public class ArrayRotationChecker {
    private int[] arr;

    public void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public void findRotationCount() {
        int n = arr.length;
        int rotationNeeded = -1;  // Index where order breaks
        int breakCount = 0;       // Number of order breaks found

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                rotationNeeded = i;
                breakCount++;
            }
        }

        if (breakCount == 0) {
            System.out.println("Number of right rotations needed: 0 (already sorted)");
        } else if (breakCount == 1 && arr[n - 1] <= arr[0]) {
            System.out.println("Number of right rotations needed: " + (n - rotationNeeded));
        } else {
            System.out.println("Invalid rotated sorted array. Rotation count: -1");
        }
    }

    public static void main(String[] args) {
        ArrayRotationChecker checker = new ArrayRotationChecker();
        checker.readArray();
        checker.findRotationCount();
    }
}
