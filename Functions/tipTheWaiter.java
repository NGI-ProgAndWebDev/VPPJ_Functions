public class tipTheWaiter{

public static void main(String[] args) {
        double bill = 50.0;
        tipTheWaiter(bill);
    }

public static void tipTheWaiter(double bill) {
    double tip = 53.50 * 0.15; // Calculate the tip (15% of the bill)
    System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);
}
}
