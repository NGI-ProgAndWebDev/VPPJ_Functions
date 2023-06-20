import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        // TO DO: Write a while loop that simulates rolling a dice until a 6 is rolled


Random random = new Random();
int dice;
while(true) {
    dice = random.nextInt(6) + 1;
    System.out.println("Rolling the dice...You rolled:" + dice);
}
if (dice == 6){
    break;

    System.out.println("You win!!");
}

           
        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        // TO DO: Write a while loop that generates random numbers between 1 and 100 until a number greater than 90 is generated
          Random random2 = new Random();
            int number;

            while(true){
                number = random.nextInt(100) + 1;
                System.out.println("Generated number:" + number);
                 
                if (number > 90){
                    break;
                }
            }
            System.out.println("A number gretaer than 90 has been generated");
        
    

        // Example 3: Keep doubling a random number until it's greater than 1000
        // TO DO: Write a while loop that keeps doubling the 'number' variable until it's greater than 1000
          
int numbers = 1;
 while(number <= 1000){
    number *=2;
 }
 System.out.println("The number doubling is:" + number);

    }
}

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
  

    // Function to generate a random integer between 1 and 100



