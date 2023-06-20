public class BuiltInFunction {
    public static void main(String[] args) {

        /**
         * Scenario 1
         * 
         * Find a built-in function that prints the message on the console.
         * @param message (String)
         */
        // Write your code here
        String message = "Hello, world!";
        System.out.println(message);
        

        /**
         * Scenario 2
         * 
         * Find a built-in function that returns the length of a string.
         * @return length (int)
         */
        // Write your code here
        String example = "Java";
        int length = example.length();
        System.out.println(length);

        /**
         * Scenario 3
         * 
         * Find a built-in function that converts a string to lowercase.
         * @return lowerCase (String)
         */
        // Write your code here
        String string = "Hello World";
        String lowercaseString = string.toLowerCase();
        System.out.println(lowercaseString);  // Output: hello world
        

        /**
         * Scenario 4
         * 
         * Find a built-in function that checks if a string starts with a specified prefix.
         * @param prefix (String)
         * @return startsWithPrefix (boolean)
         */

        // Write your code here
        String str = "Hello, world!";
        String prefix = "hello";
        boolean startsWithPrefix = str.toLowerCase().startsWith(prefix.toLowerCase());
        System.out.println(startsWithPrefix);
        


        /**
         * Scenario 5
         * 
         * Find a built-in function that replaces all occurrences of a specified character in a strung with another character.
         * @param oldChar (char)
         * @param newChar (char)
         * @return replacedString (String)
         */
        // Write your code here
        String originalString = "Hello, World!";
        char oldChar = 'o';
        char newChar = 'x';
        String replacedString = replaceChar(originalString, oldChar, newChar);
        System.out.println(replacedString);
        
        
        /**
         * Scenario 6
         * 
         * Find a built-in function that calculates the square root of a number.
         * @param number (double)
         * @return squareRoot (double)
         */
        // Write your code here
        double number = 16.0;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
        

        /**
         * Scenario 7
         * 
         * Find a built-in function that calculates the power of a number.
         * @param base (double)
         * @param exponent (double)
         * @return power (double)
         */
        // Write your code here
        double base = 4.0;
        double exponent = 0.5;
        double result = Math.pow(base, exponent);
        System.out.println(result);
        

        /**
         * Scenario 8
         * 
         * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         * @return randomNumber (double)
         */
        // Write your code here
        double randomNumber = Math.random();
        System.out.println(randomNumber);
        


        /**
         * Scenario 9
         * 
         * Find a built-in function that returns the larger of two numbers.
         * @param number1 (int)
         * @param number2 (int)
         * @return maxNumber (int)
         */
        // Write your code here
        double x = 3.14;
        double y = 2.71;
        double largerNumber = Math.max(x, y);
        System.out.println(largerNumber);
        

    }

    private static String replaceChar(String originalString, char oldChar, char newChar) {
        return null;
    }
}  

