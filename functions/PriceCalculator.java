import java.util.Arrays;

public class PriceCalculator {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];
        double taxRate = 0.13;

        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i] + (price[i] * taxRate);
        }

        System.out.println("Price array: " + Arrays.toString(price));
        System.out.println("After-tax array: " + Arrays.toString(afterTax));
    }
}

