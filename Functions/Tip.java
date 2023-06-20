import java.util.Scanner;

public class Tip {
    public static void tipTheWaiter() {
        double Bill;
        double Tip;
        Scanner kb = new Scanner(System.in);   
    
        System.out.print("Please enter your bill: ");
        Bill = kb.nextDouble();
        Tip = Bill * 0.15;

        System.out.println("Your service was wonderful! Please, accept this tip: " + Tip);
    }
    
    public static void main(String[] args) {
        tipTheWaiter();
    }
}

