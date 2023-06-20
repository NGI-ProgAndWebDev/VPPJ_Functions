    import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        int[] randomNumbers = generateRandomNumbers(10);
        
        System.out.print("Here are the scores: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        
        int highScore = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > highScore) {
                highScore = randomNumbers[i];
            }
        }
        
        System.out.println("The highest score is: " + highScore);
    }
    
    public static int[] generateRandomNumbers(int count) {
        int[] randomNumbers = new int[count];
        Random random = new Random();
        
        for (int i = 0; i < count; i++) {
            randomNumbers[i] = random.nextInt(50000);
        }
        
        return randomNumbers;
    }
}


