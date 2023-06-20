import java.util.Random;

public class randomNumber {
    
public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(50000);
    }

    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = randomNumber();
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        int highScore = 0;
        int seat = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > highScore) {
                highScore = randomNumbers[i];
                 seat = i;
            }
        }
        System.out.println("Highest Score: " + highScore);
        System.out.println("Seat Number: " + seat);
    }
}
   


