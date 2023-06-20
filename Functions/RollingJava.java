
    import java.util.Random;
import java.util.Scanner;

public class RollingJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scanner.nextLine();
        System.out.println("Great, here are the rules:\n" +
                "- If you roll a 6, the game stops.\n" +
                "- If you roll a 4, nothing happens.\n" +
                "- Otherwise, you get 1 point.\n" +
                "You must collect at least 3 points to win. Enter anything to roll:");
        scanner.nextLine();

        while (true) {
            System.out.println();
            int diceRoll = rollDice(random);
            System.out.println("You rolled a " + diceRoll + ".");

            if (diceRoll == 6) {
                System.out.println("End of game.");
                break;
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.");
            } else {
                score++;
                System.out.println("One point. Keep rolling.");
            }
        }

        System.out.println();

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }

        scanner.close();
    }

    public static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
}
