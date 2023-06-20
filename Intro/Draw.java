    import java.util.Scanner;

public class Draw {
    /**
     * Function name: draw
     * @param choice (int)
     *
     * Inside the function:
     * - Based on the choice, draw:
     * 1. a butterfly
     * 2. elephant
     * 3. bear
     * 4. snake
     */
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
                System.out.println("Invalid choice!");
        }
    }

    public static void drawButterfly() {
        System.out.println("Drawing a butterfly:");
        System.out.println("   \\ /");
        System.out.println("   - -");
        System.out.println("  /   \\");
        System.out.println("  |   |");
        System.out.println("  |   |");
        System.out.println("  \\   /");
        System.out.println("   - -");
        System.out.println("   / \\");
    }

    public static void drawElephant() {
        System.out.println("Drawing an elephant:");
        System.out.println("  \\     /");
        System.out.println("   \\ . /");
        System.out.println("    -'-'-");
        System.out.println("    |   |");
        System.out.println("   /  .  \\");
        System.out.println("  /  | |  \\");
        System.out.println(" |   | |   |");
        System.out.println(" |___|_|___|");
    }

    public static void drawBear() {
        System.out.println("Drawing a bear:");
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" |    |");
        System.out.println(" |    |");
        System.out.println(" |    |");
        System.out.println(" |    |");
        System.out.println("  \\__/");
        System.out.println(" /    \\");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println(" \\____/");
    }

    public static void drawSnake() {
        System.out.println("Drawing a snake:");
        System.out.println("   _   __");
        System.out.println("  / \\_/  \\");
        System.out.println(" /         \\");
        System.out.println("|           |");
        System.out.println(" \\         /");
        System.out.println("  \\_     _/");
        System.out.println("    |   |");
        System.out.println("    |___|");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which animal would you like to draw?");
        System.out.println("Write 1 for butterfly");
        System.out.println("Write 2 for elephant");
        System.out.println("Write 3 for bear");
        System.out.println("Write 4 for snake");

        int choice = scanner.nextInt();
        scanner.close();

        draw(choice);
    }
}

