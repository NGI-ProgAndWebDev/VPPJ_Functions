import java.util.Scanner;

public class CountingApp {

    public static void main(String[] args) {
        // Task 1: Ask Timmy what number he'd like to count up to
        Scanner scanner = new Scanner(System.in);
        System.out.print("Timmy, what number would you like to count up to? ");
        int countUpTo = scanner.nextInt();

        // Task 2: Count from 0 to the given number
        for (int i = 0; i <= countUpTo; i++) {
            System.out.print(i + " ");
        }
    }
}


