public class main2 {
    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * @param bill (double).
     *
     * Inside the function:
     * 1. Calculates a tip that's 15 percent of the bill you paid.
     * 2. Prints: your service was wonderful! Please, accept this tip: $<tip>
     */
    public static void tipTheWaiter(double bill) {
        double tip = 0.15 * bill;
        System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);
    }

    public static void main(String[] args) {
        // Call the function from main()
        tipTheWaiter(100.0); // Example: bill amount is $100.0
    }
}
