import java.util.Scanner;

public class UserInputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite subject: ");
        String subject = scanner.nextLine();

        System.out.println("Hello, " + name + "! Your favorite subject is " + subject + ".");

        scanner.close();
    }
}
