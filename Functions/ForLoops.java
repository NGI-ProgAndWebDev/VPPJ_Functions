public class ForLoops {

        public static void main(String[] args) {
            // Example 1: Print numbers from 1 to 10
            //  Write a for loop that prints numbers from 1 to 10
           for (int i = 1; i <= 10; i++) {
            System.out.println(i);
           }
            // Example 2: Print "Hello, world!" 5 times
            //  Write a for loop that prints "Hello, world!" 5 times
                for (int i = 0; i < 5; i++){
                    System.out.println("Hello world!");
                }
            // Example 3: Print the multiplication table of 5 up to 10
            //  Write a for loop that prints the multiplication table of 5 up to 10 (5 x 1, 5 x 2, ..., 5 x 10)
                System.out.println("Five X Table");
                for (int i = 1; i < 11; i++) {
                    System.out.println(i + ": " +i * 5);
                    
                }
            // Example 4: Print the numbers from 10 to 1 in reverse order
            //  Write a for loop that prints numbers from 1 to 10 in reverse order
            for (int i = 10; i >=1 ; i--) {
                System.out.println(i);
            }
              
            // Example 5: Print the first 10 even numbers
            // Write a for loop that prints the first 10 even numbers
            for (int i = 0; i < 19; i++) {
                System.out.println(i);
            }
                // way2
                for (int i = 0; i <= 10; i++) {
                    System.out.println(2 * i);
                }
                // way 3 (nested loop)
                for (int i = 2; i <21 ; i++){
                    if (i%2 == 0 ){
                        System.out.println(i);
                    }
                }
    
        }
    }

