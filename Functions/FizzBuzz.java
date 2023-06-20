public class FizzBuzz {

    public static void main(String[] args) {
        // Task 1: Make a for loop that counts from 0 to 18 and print each number
        for (int i = 0; i <= 18; i++) {
            // Task 2: Set up an if-else if-else statement to mark each number as Fizz, Buzz, or FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ": Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

