import java.util.HashMap;
import java.util.Map;

public class Anouncer {
    public static void main(String[] args) {
        
    }

      String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

  Map<String, Integer> winLossCounts = new HashMap<>();

        for (String result : record) {
            winLossCounts.put(result, winLossCounts.getOrDefault(result, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : winLossCounts.entrySet()) {
            String result = entry.getKey();
            int count = entry.getValue();
            System.out.println(result + ": " + count);
        }
    }
}
