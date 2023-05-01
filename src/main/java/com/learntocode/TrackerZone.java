package com.learntocode;

import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class TrackerZone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = new Transaction();

        try {
            BufferedReader br = new BufferedReader(new FileReader("transactions.csv")) {

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        String choice = "";
//The while loop continues until the user enters x to exit the app.
        while (!choice.equalsIgnoreCase("x")) {
//Prompt user to choose an option from the menu.
            System.out.println("Welcome to Tracker Zone!");
            System.out.println("===========================");
            System.out.println("D - Add Deposit");
            System.out.println("P - Make Payment");
            System.out.println("L - Ledger");
            System.out.println("X - Exit");
            System.out.println("Select an option (D-X):");

            choice = scanner.nextLine();

            switch (choice) {
                case "D":

                    break;
                case "P":

                    break;
                case "L":

                    break;
                case "X":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }


        }
    }
}

