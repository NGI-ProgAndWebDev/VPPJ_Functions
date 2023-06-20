import java.util.Scanner;

public class CountingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick a number to count by: ");
        int countBy = scanner.nextInt();

        System.out.print("Pick a number to start counting from: ");
        int startCount = scanner.nextInt();

        System.out.print("Pick a number to count to: ");
        int endCount = scanner.nextInt();

        for (int i = startCount; i <= endCount; i += countBy) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
