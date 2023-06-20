import java.util.Arrays;
public class Tax {
    
        public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];

        // Task 2: Calculate tax for each price and update afterTax array
        double taxRate = 0.13;
        for (int i = 0; i < price.length; i++) {
            double tax = price[i] * taxRate;
            afterTax[i] = price[i] + tax;
        }

        // Task 3: Print the arrays using Arrays.toString()
        System.out.println("Price array: " + Arrays.toString(price));
        System.out.println("After tax array: " + Arrays.toString(afterTax));
    }
}

