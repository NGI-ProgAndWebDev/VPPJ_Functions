 import java.util.Scanner;

public class JavaGrocer2 {
    public static void main(String[] args) {
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("Welcome to Java Grocers.");
        System.out.println("What can I help you find?");

        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine();

        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equalsIgnoreCase(userResponse)) {
                System.out.println("The aisle you're looking for is: " + i);
                break;
            }
        }
    }
}

