import java.util.Scanner;

public class Signing {
    public static void main(String[] args) {
        String storedUsername = "Samantha";
        String storedPassword = "Java<3";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }
}
