public class Activity42 {

    /**
     * Function name: tipTheWaiter - calculates a tip and prints it
     * 
     * @param bill
     */
    public static void tipTheWaiter(double bill) {

        double tip = bill * 0.15;
        System.out.println("Your service was wonderful! Please accept this tip $" + tip);

    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        double bill = 53.50;

        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");

        tipTheWaiter(bill);

    }

}
