import java.util.Random;
import java.util.Scanner;

public class RollingJavaGame {

    public static void main(String[] args) {
        // Task 1: Print the rules
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> Let's play Rolling Java. Type anything to start.");
        scanner.nextLine();
        
        System.out.println(">> Great, here are the rules:\n");
        System.out.println(">> - If you roll a 6, the game stops.");
        System.out.println(">> - If you roll a 4, nothing happens.");
        System.out.println(">> - Otherwise, you get 1 point.\n");
        System.out.println(">> You must collect at least 3 points to win. Enter anything to roll:");
        scanner.nextLine();

        // Task 2: Make a while loop that runs forever
        while (true) {
            scanner.nextLine(); // Task 2: Place scan.nextLine() as the first line in the loop

            // Task 4: Call rollDice() and store the value in diceRoll. Print each dice roll.
            int diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll + ".");

            // Task 5: Check the dice roll and update the score accordingly
            if (diceRoll == 6) {
                System.out.println("End of game.");
                break; // Stop the game
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.");
            } else {
                System.out.println("One point. Keep rolling.");
            }
        }

        // Task 6: Check the user's score and determine the outcome
        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }
    }

    // Task 3: Define the rollDice function
    /**
     * Function name: rollDice
     * @return randomNumber (int)
     *
     * Inside the function:
     * - Return a random number between one and six.
     */
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    // Variable to keep track of the score
    public static int score = 0;
}

