 import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick a number to count by: ");
        int countBy = scanner.nextInt();

        System.out.print("Pick a number to start counting from: ");
        int countFrom = scanner.nextInt();

        System.out.print("Pick a number to count to: ");
        int countUntil = scanner.nextInt();

        for (int i = countFrom; i <= countUntil; i += countBy) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

