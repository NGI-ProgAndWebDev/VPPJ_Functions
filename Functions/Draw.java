import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhich animal would you like to draw?");
        System.out.println("Write 1 for butterfly");
        System.out.println("Write 2 for elephant");
        System.out.println("Write 3 for bear");
        System.out.println("Write 4 for snake");

        int choice = scanner.nextInt();
        draw(choice);

        scanner.close();
    }

    public static void draw(int choice) {
        switch (choice) {
            case 1:
                drawButterfly();
                break;
            case 2:
                drawElephant();
                break;
            case 3:
                drawBear();
                break;
            case 4:
                drawSnake();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void drawButterfly() {
        System.out.println("Drawing a butterfly:");
        System.out.println("  \\ /");
        System.out.println("   - -");
        System.out.println("  / \\");
    }

    public static void drawElephant() {
        System.out.println("Drawing an elephant:");
        System.out.println("   __     __");
        System.out.println("  /  \\~~~/  \\");
        System.out.println("  \\__/ o \\__/");
        System.out.println("    |  |  |");
        System.out.println("  _/  |  \\_");
        System.out.println(" / \\  |  / \\");
        System.out.println(" \\_/__|__\\_/");
    }

    public static void drawBear() {
        System.out.println("Drawing a bear:");
        System.out.println("   /\\_");
        System.out.println(" ( o  o )");
        System.out.println("  (    )");
        System.out.println("   ^^^^");
    }

    public static void drawSnake() {
        System.out.println("Drawing a snake:");
        System.out.println("   \\\\\\\\\\");
        System.out.println("  ( o   o )");
        System.out.println("  (   U   )");
        System.out.println("   \\ (\\)/");
        System.out.println("    \\___/");
    }
}
