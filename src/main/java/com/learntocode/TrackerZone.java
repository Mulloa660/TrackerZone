package com.learntocode;

import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class TrackerZone {
    private static ArrayList<Transaction> transactions = new ArrayList<Transaction>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            BufferedReader br = new BufferedReader(new FileReader("transactions.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                String date = parts[0];
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate fecha = LocalDate.parse(date, formatter);
                String time = parts[1];
                DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime tiempo = LocalTime.parse(time, form);
                String description = parts[2];
                String vendor = parts[3];
                double amount = Double.parseDouble(parts[4]);
                transactions.add(new Transaction(fecha, tiempo, description, vendor, amount));
                //arraylist.add(new 'constructor class'(LocalDate, LocalTime, String, String, double))
            }
        } catch (Exception e) {
            System.out.println("An error has occurred!");
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
                    private static void addDeposit
                    System.out.println("Enter the deposit information:");
                    System.out.println("Date (yyyy-mm-dd:");
                    String date = scanner.nextLine();
                    System.out.println("Description:");
                    String description = scanner.nextLine();
                    System.out.println("Vendor:");
                    String vendor = scanner.nextLine();
                    System.out.println("Amount:");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
            }
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

        scanner.close();
}
}


