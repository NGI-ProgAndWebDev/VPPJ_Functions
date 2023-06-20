 import java.util.Scanner;
public class JavaGrocers {
   public static void main(String[] args) {
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Grocers.");
        System.out.print("What can I help you find? ");
        String item = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equalsIgnoreCase(item)) {
                System.out.println("We have that in aisle: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry, we don't have that item in stock.");
        }

        scanner.close();
    }
}


