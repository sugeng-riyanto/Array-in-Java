package com.book;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books to add: ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Add book details
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            System.out.print("Enter year of publication: ");
            int year = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            books.add(new Book(title, author, year));
        }

        // Display all books
        System.out.println("\nList of all books:");
        for (Book book : books) {
            book.displayBook();
        }

        // Search for books
        System.out.println("\nSearch for a book:");
        System.out.print("Enter search criterion (title/author/year): ");
        String criterion = scanner.nextLine();
        System.out.print("Enter value to search: ");
        String searchValue = scanner.nextLine();

        ArrayList<Book> searchResults = linearSearch(criterion, searchValue);

        // Display search results
        System.out.println("\nSearch results:");
        if (searchResults.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : searchResults) {
                book.displayBook();
            }
        }
    }

    // Method for searching books based on a criterion
    public static ArrayList<Book> linearSearch(String criterion, String value) {
        ArrayList<Book> results = new ArrayList<>();

        for (Book book : books) {
            switch (criterion.toLowerCase()) {
                case "title":
                    if (book.getTitle().equalsIgnoreCase(value)) {
                        results.add(book);
                    }
                    break;
                case "author":
                    if (book.getAuthor().equalsIgnoreCase(value)) {
                        results.add(book);
                    }
                    break;
                case "year":
                    if (String.valueOf(book.getYear()).equals(value)) {
                        results.add(book);
                    }
                    break;
                default:
                    System.out.println("Invalid search criterion.");
                    return results;
            }
        }
        return results;
    }
}
