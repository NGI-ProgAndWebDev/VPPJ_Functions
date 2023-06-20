import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scanner.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("- There are two players, you and the computer.");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw five cards (the river).");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner!");
        System.out.println("- Ready? Type anything if you are.");
        scanner.nextLine();

        String playerCard = randomCard();
        String computerCard = randomCard();

        System.out.println("Here's your card:\n" + playerCard);
        System.out.println("\nHere's the computer's card:\n" + computerCard);

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        scanner.nextLine();

        int playerMatches = 0;
        int computerMatches = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Card " + i);
            String riverCard = randomCard();
            System.out.println(riverCard);

            if (riverCard.equals(playerCard))
                playerMatches++;
            if (riverCard.equals(computerCard))
                computerMatches++;
        }

        System.out.println("Your number of matches: " + playerMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (playerMatches > computerMatches)
            System.out.println("You win!");
        else if (computerMatches > playerMatches)
            System.out.println("The computer wins!");
        else
            System.out.println("Everyone wins!");

        scanner.close();
    }

    public static String randomCard() {
        Random random = new Random();
        int randomNumber = random.nextInt(13) + 1;
        String card = "";

        try {
            File file = new File("cards.txt");
            Scanner scanner = new Scanner(file);
            int lineCount = 0;

            while (scanner.hasNextLine()) {
                lineCount++;
                if (lineCount == randomNumber) {
                    card = scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return card;
    }
}
