package edu.vit.corejava.basics;

import java.io.IOException;

public class Inputbasic {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter your name: ");
        int ch = System.in.read();
        System.out.println("Welcome: "+ (char)ch);
    }
}
