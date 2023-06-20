import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");
        String userInput = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < items.length; i++) {
            if (userInput.equalsIgnoreCase(items[i])) {
                System.out.println("The item is located in aisle " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry, the item is not available.");
        }
    }
}

