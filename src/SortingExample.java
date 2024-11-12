import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        String[] books = {"Math", "History", "Physics", "Chemistry", "Biology"};
        Arrays.sort(books);  // Sorts the array alphabetically

        System.out.println("Books in alphabetical order:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
