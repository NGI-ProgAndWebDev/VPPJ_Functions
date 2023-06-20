public class HighestScore {
    public static void main(String[] args) {
        int seat = 0;
        int[] scores = new int[10];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = randomNumber();
        }

        System.out.print("Here are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > scores[seat])
                seat = i;
        }

        System.out.println("\nThe highest score is: " + scores[seat] + ". Impressive!");
        System.out.println("It's the gentlemen in seat " + seat + ". Give that man a cookie!");
    }

    public static int randomNumber() {
        return (int) Math.floor((Math.random() * 49999));
    }
}
