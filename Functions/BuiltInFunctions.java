import java.util.Random;

public class BuiltInFunctions {
    public static void main(String[] args) {

        /**
         * Scenario 1
         * 
         * Find a built-in function that prints the message on the console.
         * @param message (String)
         */
        // Write your code here
        System.out.println("Hello World!");


        /**
         * Scenario 2
         * 
         * Find a built-in function that returns the length of a string.
         * @return length (int)
         */
        String example = "Java";
        int length = example.length();
        System.out.println(length);
        // Write your code here


        /**
         * Scenario 3
         * 
         * Find a built-in function that converts a string to lowercase.
         * @return lowerCase (String)
         */
        // Write your code here
        String str = "Hello World";
String lowercaseStr = str.toLowerCase();
System.out.println(lowercaseStr);

        


        /**
         * Scenario 4
         * 
         * Find a built-in function that checks if a string starts with a specified prefix.
         * @param prefix (String)
         * @return startsWithPrefix (boolean)
         */

        // Write your code here
        String yo = "Cruel World";
      String prefix = "Cruel";

         boolean startsWithPrefix = yo.startsWith(prefix);
         System.out.println(startsWithPrefix);



        /**
         * Scenario 5
         * 
         * Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         * @param oldChar (char)
         * @param newChar (char)
         * @return replacedString (String)
         */
        // Write your code here
        String kim = "Hello World";
       String replacedStr = kim.replace('o', 'x');
       System.out.println(replacedStr);

        
        /**
         * Scenario 6
         * 
         * Find a built-in function that calculates the square root of a number.
         * @param number (double)
         * @return squareRoot (double)
         */
        // Write your code here
        int X = 9;
        double squareRoot = Math.sqrt(X);
        System.out.println("The square root of " + X + " is " + squareRoot);


        /**
         * Scenario 7
         * 
         * Find a built-in function that calculates the power of a number.
         * @param base (double)
         * @param exponent (double)
         * @return power (double)
         */
        // Write your code here
        double x = 2;
        double z = 4;
        System.out.println(Math.pow(x,z)); 




        /**
         * Scenario 8
         * 
         * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         * @return randomNumber (double)
         */
        // Write your code here
        double randomNumber = 0.0;
        Random generator = new Random();
        randomNumber = generator.nextDouble(1.0);
        System.out.println();
        




        /**
         * Scenario 9
         * 
         * Find a built-in function that returns the larger of two numbers.
         * @param number1 (int)
         * @param number2 (int)
         * @return maxNumber (int)
         */
        // Write your code here
        int num1 = 10;
        int num2 = 15;

        int largerNumber = Math.max(num1, num2);
         System.out.println(largerNumber);
  


    }
}
