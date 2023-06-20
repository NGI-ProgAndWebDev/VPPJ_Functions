 import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task 2: Explain the rules and prompt the user to start
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("- There are two players, you and the computer.");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw five cards (the river).");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner!");
        System.out.println("- Ready? Type anything if you are.");
        scanner.nextLine(); // Wait for user input
        
        // Task 3: Present the user with a card and show the computer's card
        String userCard = randomCard();
        String computerCard = randomCard();
        System.out.println("Here's your card:");
        System.out.println(userCard);
        System.out.println("\nHere's the computer's card:");
        System.out.println(computerCard);
        
        // Task 4: Draw five cards
        System.out.println("\nNow, the dealer will draw five cards. Press enter to continue.");
        scanner.nextLine(); // Wait for user input
        System.out.println();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Card " + i);
            String riverCard = randomCard();
            System.out.println(riverCard);
            System.out.println();
        }
        
        // Task 5: Count matches and determine the winner
        int userMatches = countMatches(userCard, 5);
        int computerMatches = countMatches(computerCard, 5);
        
        System.out.println("Your number of matches: " + userMatches);
        System.out.println("Computer number of matches: " + computerMatches);
        
        if (userMatches > computerMatches) {
            System.out.println("You win!");
        } else if (computerMatches > userMatches) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }
        
        scanner.close();
        }
    
    // Task 1: Define the randomCard function
    private static int countMatches(String computerCard, int i) {
        return 0;
    }

    public static String randomCard() {
        int randomNum = (int) (Math.random() * 13) + 1;
        
        switch (randomNum) {
            case 1:
                return "1:\n" +
                        " _____\n" +
                        "|A    |\n" +
                        "|  *  |\n" +
                        "| * * |\n" +
                        "|*   *|\n" +
                        "|_____|\n";
            case 2:
                return "2:\n" +
                        " _____\n" +
                        "|2    |\n" +
                        "| * * |\n" +
                        "|     |\n" +
                        "| * * |\n" +
                        "|_____|\n";
            case 3:
                return "3:\n" +
                        " _____\n" +
                        "|3    |\n" +
                        "| * * |\n" +
                        "|  *  |\n" +
                        "| * * |\n" +
                        "|_____|\n";
            case 4:
                return "4:\n" +
                        " _____\n" +
                        "|4    |\n" +
                        "| * * |\n" + ;
                        "|     |\ 
 {
    
 }

                

