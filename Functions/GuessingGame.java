import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(5) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 5:");

        while (true) {
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed it right.");
                break;
            } else {
                System.out.println("Wrong guess. Try again:");
            }
        }

        scanner.close();
    }
}
