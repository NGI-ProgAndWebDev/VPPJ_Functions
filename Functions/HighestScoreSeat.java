public class HighestScoreSeat {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 95, 88};
        int seat = 0;

        int highestScore = scores[0];  // Assume the first score is the highest

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                seat = i;
            }
        }

        System.out.println("The seat number with the highest score is: " + seat);
    }
}

