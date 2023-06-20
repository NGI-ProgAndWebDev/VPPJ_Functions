// Function to simulate rolling a dice (returns a random integer between 1 and 6)
  
        import java.util.Random;

        public class DiceRoller {
            public static int rollDice() {
            Random random = new Random();
            return random.nextInt(6) + 1;
    }

             public static void main(String[] args) {
            int result = rollDice();
            System.out.println("Rolled: " + result);
    }
}

    // Function to generate a random integer between 1 and 100
   public class RandomNumberGenerator {
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        int result = generateRandomNumber();
        System.out.println("Generated number: " + result);
    }
}