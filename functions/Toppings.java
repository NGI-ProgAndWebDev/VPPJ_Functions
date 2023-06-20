import java.util.Scanner;

public class Toppings {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many toppings do you want to add? ");
            int numToppings = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the previous input

            String[] toppings = new String[numToppings];

            for (int i = 0; i < numToppings; i++) {
                System.out.print((i + 1) + ". Enter a topping: ");
                toppings[i] = scanner.nextLine();
            }

            System.out.println("\nThese are the toppings you entered:");

            for (int i = 0; i < numToppings; i++) {
                System.out.println(toppings[i]);
            }
        }
    }
}

