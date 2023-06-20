public class BreakAndContinueExamples {
    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        // TO DO: Write a loop that prints numbers from 1 to 10, but stops when the number 5 is reached using the 'break' statement
            
        for (int i = 1; i < 11; i++){
                if (i == 5 ){
                    break;
                }
                System.out.println(i);
            }
        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        // TO DO: Write a loop that prints numbers from 1 to 10, but skips the number 5 using the 'continue' statement
           
        System.out.println("\nNumbers");
             for (int i = 1; i<11; i++){
                if (i == 5){
                    continue;
                }
                System.out.println(i);
            }
        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        // TO DO: Write a loop that finds the smallest number greater than 20 that is divisible by 3 using the 'break' statement
           
    
            int number = 21;
            while(true){
                if (number % 3 == 0){ //check if number is divisible by 3
                    break; //exit loop if condition is met

                }
                number ++;
                System.out.println("The smallest number greater than 20 divisible by 3 is" + number);
            }
        

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        // TO DO: Write a loop that prints all even numbers from 1 to 20, skipping odd numbers using the 'continue' statement

for (int i = 1; i<=20; i++){
    if(i % 2 != 0){ //check if number is odd
        continue;// skip the rest of code and continue

    }

    System.out.println(i);
}

        }
    }
