import java.util.Random;

public class WhileLoopExamples {

    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        // TODO: Write a while loop that simulates rolling a dice until a 6 is rolled
        int diceRoll;
        Random random = new Random();
        
        do {
            diceRoll = rollDice();
            System.out.println("Dice roll: " + diceRoll);
        } while (diceRoll != 6);
        
        System.out.println("A 6 was rolled!");
        System.out.println();
        
        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        // TODO: Write a while loop that generates random numbers between 1 and 100 until a number greater than 90 is generated
        int randomNumber;
        
        do {
            randomNumber = generateRandomNumber();
            System.out.println("Generated number: " + randomNumber);
        } while (randomNumber <= 90);
        
        System.out.println("A number greater than 90 was generated!");
        System.out.println();
        
        // Example 3: Keep doubling a random number until it's greater than 1000
        // TODO: Write a while loop that keeps doubling the 'number' variable until it's greater than 1000
        int number = generateRandomNumber();
        
        while (number <= 1000) {
            System.out.println("Current number: " + number);
            number *= 2;
        }
        
        System.out.println("The number is now greater than 1000!");
    }

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    // Function to generate a random integer between 1 and 100
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}

