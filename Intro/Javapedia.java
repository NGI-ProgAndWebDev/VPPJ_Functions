import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********Javapedia**********");

        System.out.print("How many historical figures will you register? ");
        int numFigures = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[][] database = new String[numFigures][3];

        for (int i = 0; i < numFigures; i++) {
            System.out.println(" Figure: " + (i + 1));

            System.out.print(" - Name: ");
            String name = scanner.nextLine();
            database[i][0] = name;

            System.out.print(" - Date of birth: ");
            String dob = scanner.nextLine();
            database[i][1] = dob;

            System.out.print(" - Occupation: ");
            String occupation = scanner.nextLine();
            database[i][2] = occupation;
        }

        System.out.println("\nThese are the values you stored:");
        print2DArray(database);

        System.out.print("Who do you want information on? ");
        String searchName = scanner.nextLine();
        searchAndPrint(database, searchName);

        scanner.close();
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

    public static void searchAndPrint(String[][] array, String searchName) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equalsIgnoreCase(searchName)) {
                System.out.println("\n Name: " + array[i][0]);
                System.out.println(" Date of birth: " + array[i][1]);
                System.out.println(" Occupation: " + array[i][2]);
                return;
            }
        }

        System.out.println("\nNo information found for " + searchName);
    }
}


