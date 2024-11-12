package com.tutorial;

import java.util.Scanner;

public class Guided1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNames = 0;

        // Get the number of names with validation
        while (true) {
            System.out.print("Enter the number of names: ");
            if (scanner.hasNextInt()) {
                numNames = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                break;
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        // Initialize array for names
        String[] names = new String[numNames];

        // Input names
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Input name to search for
        System.out.print("Enter the name to search for: ");
        String searchName = scanner.nextLine();

        // Perform linear search
        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        // Output search result
        if (found) {
            System.out.println("Name found.");
        } else {
            System.out.println("Name not found.");
        }

        scanner.close();
    }
}
