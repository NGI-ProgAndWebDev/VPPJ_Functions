public class TipTheWaiter {
        public static void tipTheWaiter(double bill) {
            double tip = bill * 0.15;
            System.out.printf("Your service was wonderful! Please, accept this tip: $%.2f%n", tip);
        }
    
        public static void main(String[] args) {
            double billAmount = 50.0;
            tipTheWaiter(billAmount);
        }
    
    
}


