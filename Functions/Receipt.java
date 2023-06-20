public class Receipt{

       public static void main(String[] args) {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] prices = {4.99, 3.49, 4.29};

        // Task 2: Print each apple and its price
        for (int i = 0; i < apples.length; i++) {
            System.out.println(apples[i] + ": R" + prices[i]);
        }
    }
}