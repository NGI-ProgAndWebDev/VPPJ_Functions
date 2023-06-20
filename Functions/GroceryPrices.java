public class GroceryPrices {
    public static void main(String[] args) {
        double[][] prices = {
            {2.99, 3.49, 1.99},
            {1.25, 2.15, 0.99},
            {3.99, 4.49, 2.99}
        };

        for (int i = 0; i < prices.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Baking: ");
                    break;
                case 1:
                    System.out.print("Beverage: ");
                    break;
                case 2:
                    System.out.print("Cereals: ");
                    break;
            }

            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + " ");
            }

            System.out.println();
        }
    }
}

