    import java.util.Scanner;

public class Javagram {
    public static void main(String[] args) {
        signIn();
    }
    
    public static void signIn() {
        String storedUsername = "Samantha";
        String storedPassword = "Java<3";
        
        Scanner scanner = new Scanner(System.in);
        String enteredUsername, enteredPassword;
        
        do {
            System.out.print("Username: ");
            enteredUsername = scanner.nextLine();
            
            System.out.print("Password: ");
            enteredPassword = scanner.nextLine();
            
            if (!enteredUsername.equals(storedUsername) || !enteredPassword.equals(storedPassword)) {
                System.out.println("Incorrect username or password. Please try again.\n");
            }
        } while (!enteredUsername.equals(storedUsername) || !enteredPassword.equals(storedPassword));
        
        System.out.println("Sign-in successful!");
    }
}


