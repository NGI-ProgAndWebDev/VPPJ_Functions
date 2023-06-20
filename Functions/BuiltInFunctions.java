public class BuiltInFunctions {
    public static void main(String[] args) {
        /**
         * Scenario 1
         * 
         * Find a built in function that prints the message on the console
         * 
         */


           /**
         * Scenario 2
         * 
         * Find a built-in function that returns the length of a string.
         * @return length (int)
         */
        String example = "Java";
        int length = example.length();
        System.out.println(length);
        


        /**
         * Scenario 3
         * 
         * Find a built-in function that converts a string to lowercase.
         * @return lowerCase (String)
         */
        String originalString = "Hello, World!";
        String lowerCaseString = originalString.toLowerCase();
        System.out.println(lowerCaseString);

        // Write your code here


        /**
         * Scenario 4
         * 
         * Find a built-in function that checks if a string starts with a specified prefix.
         * @param prefix (String)
         * @return startsWithPrefix (boolean)
         */
        String originalString = "Hello, World!";
        String prefix = "Hello";
        boolean startsWithPrefix = originalString.startsWith(prefix);
        System.out.println(startsWithPrefix);

        // Write your code here



        /**
         * Scenario 5
         * 
         * Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         * @param oldChar (char)
         * @param newChar (char)
         * @return replacedString (String)
         */
        String originalString = "Hello, world!";
        char oldChar = 'o';
        char newChar = 'x';
        String replacedString = originalString.replace(oldChar, newChar);
        System.out.println(replacedString);

        // Write your code here

        
        /**
         * Scenario 6
         * 
         * Find a built-in function that calculates the square root of a number.
         * @param number (double)
         * @return squareRoot (double)
         */
        double number = 16.0;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);

        // Write your code here


        /**
         * Scenario 7
         * 
         * Find a built-in function that calculates the power of a number.
         * @param base (double)
         * @param exponent (double)
         * @return power (double)
         */
        double base = 2.0;
        double exponent = 3.0;
        double result = Math.pow(base, exponent);
        System.out.println(result);

        // Write your code here


        /**
         * Scenario 8
         * 
         * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         * @return randomNumber (double)
         */
        double randomValue = Math.random();
        System.out.println(randomValue);

        // Write your code here



        /**
         * Scenario 9
         * 
         * Find a built-in function that returns the larger of two numbers.
         * @param number1 (int)
         * @param number2 (int)
         * @return maxNumber (int)
         */
        int number1 = 10;
        int number2 = 5;
        int largerNumber = Math.max(number1, number2);
        System.out.println(largerNumber);

        // Write your code here


    }
}
        
    