import java.util.Scanner;

public class ActivityGrocer {
    public static void main(String[] args) {
        String[] aisles = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Java Grocers.");

        boolean found = false;

        do {
            System.out.println("What can I help you find?");
            String item = sc.nextLine();

            for (int i = 0; i < aisles.length; i++) {
                if (aisles[i].equalsIgnoreCase(item)) {
                    found = true;
                    System.out.println("\nWe have that in aisle: " + i);
                    break;
                }
            }

            if (!found)
                System.out.println("\nWe do not have that item.");
        } while (!found);
    }

}
