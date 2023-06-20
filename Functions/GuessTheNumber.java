import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Task 1: Store a "secret" number between 1 and 5
        int secretNumber = (int) (Math.random() * 5) + 1;

        // Task 2: Set up a loop that keeps the user guessing until they get it right
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number between 1 and 5: ");
            guess = scanner.nextInt();
        } while (guess != secretNumber);

        // Task 3: After they guess the number, print "You got it"
        System.out.println("You got it!");
    }
}

