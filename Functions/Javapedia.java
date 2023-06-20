import java.util.Scanner;

public class Javapedia {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Ask the user how many historical figures to register
        System.out.print("How many historical figures will you register? ");
        int numFigures = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Task 2: Create the database 2D array
        String[][] database = new String[numFigures][3];

        // Task 3: Populate the database with user input
        for (int i = 0; i < numFigures; i++) {
            System.out.println("Figure " + (i + 1) + ":");
            System.out.print(" - Name: ");
            database[i][0] = scanner.nextLine();
            System.out.print(" - Date of birth: ");
            database[i][1] = scanner.nextLine();
            System.out.print(" - Occupation: ");
            database[i][2] = scanner.nextLine();
        }

        // Task 4: Print the contents of the database
        System.out.println("Database:");
        print2DArray(database);

        // Task 5: Search the database by name
        System.out.print("Who do you want information on? ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < numFigures; i++) {
            if (database[i][0].equalsIgnoreCase(searchName)) {
                System.out.println("Name: " + database[i][0]);
                System.out.println("Date of birth: " + database[i][1]);
                System.out.println("Occupation: " + database[i][2]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No information found for " + searchName);
        }
    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

