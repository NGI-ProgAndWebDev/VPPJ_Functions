import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********Javapedia**********");
        System.out.print("How many historical figures will you register? ");
        int numFigures = scanner.nextInt();

        String[][] database = new String[numFigures][3];

        for (int i = 0; i < numFigures; i++) {
            System.out.println("Figure: " + (i + 1));
            scanner.nextLine(); // Clear the newline character from the previous input

            System.out.print("- Name: ");
            String name = scanner.nextLine();

            System.out.print("- Date of birth: ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("- Occupation: ");
            String occupation = scanner.nextLine();

            database[i][0] = name;
            database[i][1] = dateOfBirth;
            database[i][2] = occupation;
        }

        System.out.println("\nThese are the values you stored:");

        for (int i = 0; i < numFigures; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + database[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nWho do you want information on? ");
        String searchName = scanner.nextLine();

        for (int i = 0; i < numFigures; i++) {
            if (database[i][0].equalsIgnoreCase(searchName)) {
                System.out.println("\nName: " + database[i][0]);
                System.out.println("Date of birth: " + database[i][1]);
                System.out.println("Occupation: " + database[i][2]);
                break;
            }
        }
    }
}

