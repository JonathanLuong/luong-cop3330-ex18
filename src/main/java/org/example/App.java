package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String choice = reader.nextLine();

        if(choice.equals("C") || choice.equals("c")) {
            System.out.printf("Please enter the temperature in Fahrenheit: ");
            String fah = reader.nextLine();

            int f = Integer.parseInt(fah);
            int C = (f - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %d.", C);
        }
        else if (choice.equals("F") || choice.equals("f")){
            System.out.printf("Please enter the temperature in Celsius: ");
            String cen = reader.nextLine();

            int c = Integer.parseInt(cen);
            int F = (c * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %d.", F);
        }
    }
}