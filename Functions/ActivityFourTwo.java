import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ActivityFourTwo {
    /**
     * function name : tipTheWaiter 
     * 
     * inside the function : 
     * 1. calculates a tip that is 15% of the pill you paid 
     * 2. prints: your service was wonderfull! please, accept this tip: tip $
     * 
     */
    public static void tipTheWaiter() {
double paid=0;  
double tip=0;
double totalAmount = 0; 

Scanner scan = new Scanner(System.in);
System.out.println("Enter your total bill amount: ");
paid = scan.nextInt(); 
System.out.println("========================\n");

// tip = paid *15 / 100

tip =( paid * 15)/ 100; 

System.out.println("Your service was wonderfull!\n Please, except this tip: " + tip + "$");
       
totalAmount = paid+ tip; 
System.out.println("Your total bill amount is : " + totalAmount + "$");
    }
    public static void main(String[] args) {
      tipTheWaiter();
    }
}

