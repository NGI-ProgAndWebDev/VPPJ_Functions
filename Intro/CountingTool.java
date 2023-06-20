import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to count up to, Timmy? ");
        int countUpTo = scanner.nextInt();

        for (int i = 0; i <= countUpTo; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}


