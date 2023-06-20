import java.util.Random;
import java.util.Scanner;

public class RandomCard {
    public static void main(String[] args) {
        /**
         * Function name-- randomCard
         * @return (String)
         * 
         *Inside the function:
         *Gets random number between 1 and 13
         *Returns a card that matches random number
         */

         //Task 1

        Random random = new Random();
        random = (i = 1, i = 12 + 1);

        //Task 2
        System.out.println("Here are the rules of the game:");
        System.out.println("Its like Poker but a lot simplier");
        System.out.println("There are two players, you and the computer");
        System.out.println("The dealer will give each player one card");
        System.out.println("Then, the dealer will draw five cards (the river)");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyones a winner!");
        System.out.println("Ready? Type something if you are:");

        //Task 3
        System.out.println("Heres your card:");
        random  = (i = 1, i = 12 + 1);

        System.out.println("Heres the computers card:");
        random  = (i = 1, i = 12 + 1);

        System.out.println("Now the dealer will draw five cards, press Enter to continue");

        //Task 4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to draw a card:");

        for (int i = 1; i <= 5; i++) {
            scanner.nextLine();
            System.out.println("Card " + i + ": " + drawCard());
        }
    }

    private static java.lang.String drawCard() {
        return null;
    }

    }

