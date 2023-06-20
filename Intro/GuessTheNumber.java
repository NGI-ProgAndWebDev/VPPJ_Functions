import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 5) + 1;
        int guess;

        do {
            System.out.print("Guess the secret number (between 1 and 5): ");
            guess = scanner.nextInt();
        } while (guess != secretNumber);

        System.out.println("You got it!");
        
        scanner.close();
    }

}

    

