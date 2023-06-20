public class FightRecord {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                wins++;
            } else if (record[i].equals("LOSS")) {
                losses++;
            }
        }

        System.out.println("Number of wins: " + wins);
        System.out.println("Number of losses: " + losses);
    }
}

