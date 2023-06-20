import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        //Task 1
        Scanner scanner = new Scanner (System.in);

        System.out.println("Welcome! Please sign in.");
        System.out.println("Username: ");
        java.lang.String username = scanner.nextLine();

        System.out.println("Password: ");
        java.lang.String password = scanner.nextLine();

        //Task 3
        
        if (authenticate(username, password)){
            System.out.println("Sign-in successful! Welcome," + username + ".");

        }else {
            System.out.println("Invalid username or password. Please try again.");
            
        }

    }

    private static boolean authenticate(java.lang.String username2, java.lang.String password2) {
        return false;
    
        //Task 2

        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("Welcome! Please sign in.");
            System.out.print("Username: ");
            java.lang.String username = scanner.nextLine();

            System.out.print("Password: ");
            java.lang.String password = scanner.nextLine();

            // Your authentication logic here
            if (authenticate(username, password)) {
                loggedIn = true;
                System.out.println("Sign-in successful! Welcome, " + username + ".");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }

    public static boolean (String username, String password) {
        // Replace this with your actual authentication logic
        // Compare the username and password with your user database or other validation logic
        // Return true if the authentication is successful, false otherwise
        Object password;
        return username.equals("admin") && password.equals("password");
    }


    }

