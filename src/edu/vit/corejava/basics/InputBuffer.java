package edu.vit.corejava.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBuffer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        System.out.println("Enter your name: ");
        String name = br.readLine();
        System.out.println("Welcome: "+name);
        System.out.println("Enter your age: ");
        String age = br.readLine();
        int intAge = Integer.parseInt(age);
        System.out.println(" Your age is: "+intAge);
    }
}
