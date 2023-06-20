import java.util.Random;
import java.util.Scanner;

public class RollingJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scanner.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        scanner.nextLine();

        int score = 0;

        while (true) {
            System.out.println("Hey"); // Remove this line after testing

            int diceRoll = rollDice();
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

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }

        scanner.close();
    }

    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

    
