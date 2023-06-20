import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] scores = new int[10];
        
        for (int i = 0; i < scores.length; i++) {
            scores[i] = randomNumber();
        }
        
        System.out.print("Here are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        
        int highScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
        
        System.out.println("The highest score is: " + highScore);
    }
    
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(50000);
    }
}

