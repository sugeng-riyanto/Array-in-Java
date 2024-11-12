package com.tutorial;
import java.util.Arrays;
import java.util.Scanner;

public class Guided2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of names
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Initialize array for names
        String[] names = new String[numNames];

        // Input names
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Sort the array alphabetically
        Arrays.sort(names);

        // Display sorted names
        System.out.println("Sorted names: ");
        for (String name : names) {
            System.out.println(name);
        }

        // Input name to search for
        System.out.print("Enter the name to search for: ");
        String searchName = scanner.nextLine();

        // Perform binary search
        int index = Arrays.binarySearch(names, searchName);

        // Output search result
        if (index >= 0) {
            System.out.println("Name found at position: " + (index + 1));
        } else {
            System.out.println("Name not found.");
        }

        scanner.close();
    }
}
