import java.util.Random;
import java.util.Scanner;

public class Pokerito {

    public static void main(String[] args) {
        // Task 2: Explain the rules and prompt the user to start
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("- There are two players, you and the computer.");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw five cards (the river).");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner!");
        System.out.println("- Ready? Type anything if you are.");
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Wait for user input to continue
        
        // Task 3: Present the user with a card and the computer's card
        String userCard = randomCard();
        String computerCard = randomCard();
        System.out.println("Here's your card:");
        System.out.println(userCard);
        System.out.println();
        System.out.println("Here's the computer's card:");
        System.out.println(computerCard);
        System.out.println();
        
        // Task 4: Dealer draws five cards (the river)
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scanner.nextLine(); // Wait for user input to continue
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Card " + i);
            System.out.println(randomCard());
            System.out.println();
        }
        
        // Task 5: Count matches and determine the winner
        int userMatches = countMatches(userCard);
        int computerMatches = countMatches(computerCard);
        
        System.out.println("Your number of matches: " + userMatches);
        System.out.println("Computer number of matches: " + computerMatches);
        
        if (userMatches > computerMatches) {
            System.out.println("You win!");
        } else if (computerMatches > userMatches) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }
    }

    public static String randomCard() {
        Random random = new Random();
        int randomNumber = random.nextInt(13) + 1;

        switch (randomNumber) {
            case 1:
                return " _____\n" +
                       " |A _  |\n" +
                       " | ( ) |\n" +
                       " |(_'_)|\n" +
                       " |  |  |\n" +
                       " |____V|\n";
            case 2:
                return " _____\n" +
                       " |2    |\n" +
                       " | o o |\n" +
                       " |  o  |\n" +
                       " | o o |\n" +
                       " |____Z|\n";
            // Rest of the card cases...
            default:
                return "";
        }
    }
    
    public static int countMatches(String card) {
        int count = 0;
        
        // Count the number of matches in the card string
        
        return count;
    }
}

