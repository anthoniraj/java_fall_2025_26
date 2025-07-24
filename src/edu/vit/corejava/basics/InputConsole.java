package edu.vit.corejava.basics;

import java.io.Console;

public class InputConsole {
    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("Enter your name: ");
        System.out.println("Your name is: "+ name);
        char[] ch = console.readPassword("Enter Passowrd: ", "");
        System.out.println("Secret code is: "+ String.valueOf(ch));
        
    }    
}