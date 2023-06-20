 import java.util.Scanner;

public class PizzaToppings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pizza toppings do you want to add? ");
        int numToppings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] toppings = new String[numToppings];

        for (int i = 0; i < numToppings; i++) {
            System.out.print((i + 1) + ". Enter a pizza topping: ");
            String topping = scanner.nextLine();
            toppings[i] = topping;
        }

        System.out.println("\nPizza Toppings:");

        for (int i = 0; i < toppings.length; i++) {
            System.out.println((i + 1) + ". " + toppings[i]);
        }

        scanner.close();
    }
}


