public class NestedLoop {
        public static void main(String[] args) {
        String[][] prices = {
            {"$2.50", "$1.80", "$3.25"},
            {"$1.20", "$1.50", "$1.75"},
            {"$2.10", "$2.30", "$2.50"}
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

            System.out.print("\n");
        }
    }
}

