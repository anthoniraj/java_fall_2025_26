package edu.vit.corejava.syntax;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 90) {
            System.out.println("S Grade");
        } else if (marks >= 80) {
            System.out.println("A Grade");
        } else if (marks >= 70) {
            System.out.println("B Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
