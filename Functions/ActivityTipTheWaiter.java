public class ActivityTipTheWaiter {
    public static void main(String[] args) {
        tipTheWaiter(50);
    }

    public static void tipTheWaiter(double bill) {
        double tip = (double) bill * 0.15;
        System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);
    }
}
