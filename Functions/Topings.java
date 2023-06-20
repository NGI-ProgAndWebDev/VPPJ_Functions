import java.util.Scanner;
public class Topings {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numToppings = Integer.parseInt(scanner.nextLine());
        String[] toppings = new String[numToppings];

        // Task 1: Collect user input for toppings
        for (int i = 0; i < toppings.length; i++) {
            System.out.print("Enter topping " + (i + 1) + ": ");
            toppings[i] = scanner.nextLine();
        }

        // Task 2: Print each topping
        for (int i = 0; i < toppings.length; i++) {
            System.out.println("Topping " + (i + 1) + ": " + toppings[i]);
        }
    }
}









