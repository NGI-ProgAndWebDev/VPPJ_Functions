import java.util.Scanner;

public class CountingProgram {

    public static void main(String[] args) {
        // Task 1: Get integers from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a number to count by: ");
        int step = scanner.nextInt();

        System.out.print("Pick a number to start counting from: ");
        int start = scanner.nextInt();

        System.out.print("Pick a number to count to: ");
        int end = scanner.nextInt();

        // Task 2: Write a loop
        for (int i = start; i <= end; i += step) {
            System.out.print(i + " ");
        }
    }
}

