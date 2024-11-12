import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        String[] books = {"Math", "History", "Physics", "Chemistry", "Biology"};
        Arrays.sort(books);  // Sorts the list alphabetically

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a book name to search: ");
        String searchBook = scanner.nextLine();

        int result = Arrays.binarySearch(books, searchBook);

        if (result >= 0) {
            System.out.println(searchBook + " is available.");
        } else {
            System.out.println(searchBook + " is not available.");
        }

        scanner.close();
    }
}
