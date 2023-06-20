public class EvenOddNumbers {

    public static void main(String[] args) {
        // Task 1: Make a for loop that counts from 0 to 19
        for (int i = 0; i <= 19; i++) {
            // Task 2: Use an if-else statement to mark each number as even or odd
            if (i % 2 == 0) {
                System.out.println(i + ": Even");
            } else {
                System.out.println(i + ": Odd");
            }
        }
    }
}
