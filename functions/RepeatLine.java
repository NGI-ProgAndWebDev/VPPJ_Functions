import java.util.Scanner;

public class RepeatLine {

    public static void main(String[] args) {
        // Task 1: Ask Bart to enter the line
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bart, please enter the line you want to write: ");
        String line = scanner.nextLine();

        // Task 2: Print the line 99 times
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + ": " + line);
        }
    }
}
