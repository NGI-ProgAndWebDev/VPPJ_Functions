public class WhileLoopExamples {

    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        // Write a while loop that simulates rolling a dice until a 6 is rolled
        int diceRoll = diceRoll();
        while (diceRoll != 6) {
            System.out.println(diceRoll);
            diceRoll = diceRoll();
        }

        // Example 2: Generate random numbers between 1 and 100 until a number greater
        // than 90 is generated
        // Write a while loop that generates random numbers between 1 and 100 until a
        // number greater than 90 is generated
        int randomNumber = generateRandomInteger();
        while (randomNumber < 90) {
            System.out.println(randomNumber);
            randomNumber = generateRandomInteger();
        }

        // Example 3: Keep doubling a random number until it's greater than 1000
        // Write a while loop that keeps doubling the 'number' variable until it's
        // greater than 1000
        int randomNumber2 = generateRandomInteger();
        while (randomNumber2 < 1000) {
            System.out.println(randomNumber2);
            randomNumber2 *= 2;
        }

    }

    // Function to simulate rolling a dice (returns a random integer between 1 and
    // 6)
    public static int diceRoll() {
        return (int) Math.floor((Math.random() * 6) + 1);
    }

    // Function to generate a random integer between 1 and 100
    public static int generateRandomInteger() {
        return (int) Math.floor((Math.random() * 100) + 1);
    }
}