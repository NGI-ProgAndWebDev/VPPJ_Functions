import java.util.Scanner;

public class JavaGramSignIn {
    public static void main(String[] args) {
        // Task 1: Store the username and password
        String storedUsername = "Mewael";
        String storedPassword = "Java<3";
        
        // Task 2: Loop for sign-in until correct username and password are entered
        boolean signInSuccessful = false;
        Scanner scanner = new Scanner(System.in);
        
        while (!signInSuccessful) {
            // Prompt the user to enter their username and password
            System.out.print("Username: ");
            String enteredUsername = scanner.nextLine();
            
            System.out.print("Password: ");
            String enteredPassword = scanner.nextLine();
            
            // Check if the entered username and password are correct
            if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                signInSuccessful = true;
            } else {
                System.out.println("Incorrect username or password. Please try again.\n");
            }
        }
        
        // Task 3: Print the successful sign-in message
        System.out.println("Sign-in successful! Welcome to Javagram, " + storedUsername + "!");
        
        // Close the scanner
        scanner.close();
    }
}

