public class RingAnnouncer {
 public static void main(String[] args) {
     String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
     int wins = 0;
     int losses = 0;
    
     for (String result : record) {
        if (result.equals("WIN")) {
                 wins++;
         } else if (result.equals("LOSS")) {
               losses++;
                }
            }
    
            System.out.println("Number of wins: " + wins);
            System.out.println("Number of losses: " + losses);
        }
    }
    

