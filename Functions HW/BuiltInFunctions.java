public class BuiltInFunctions {

    public static void main(String[] args) {

        /**
         * Scenario 1
         * 
         * Find a built-in function that prints the message on the console.
         * @param message (String)
         */
        // Write your code here
        System.out.println("Scenario 1 (print function)\n");
        System.out.println("Hi");
        System.out.println("--------------------------");


        /**
         * Scenario 2
         * 
         * Find a built-in function that returns the length of a string.
         * @return length (int)
         */
        // Write your code here
        
         System.out.println("Scenario 2 (length of string)\n");
        String example = "Java";
        int length = example.length();
        System.out.println("Length of 'Java' is " + length);
        System.out.println("--------------------------");


        /**
         * Scenario 3
         * 
         * Find a built-in function that converts a string to lowercase.
         * @return lowerCase (String)
         */
        // Write your code here
        System.out.println("Scenario 3 (lowercase function)\n");
        String hi = "I am Zee";
        System.out.println(hi + " to " +hi.toLowerCase());
        System.out.println("--------------------------");


        /**
         * Scenario 4
         * 
         * Find a built-in function that checks if a string starts with a specified prefix.
         * @param prefix (String)
         * @return startsWithPrefix (boolean)
         */
        // Write your code here
        System.out.println("Scenario 4 (starts with specified prefix)\n");
        String prefix = "IT Application Development";
        System.out.println(prefix);
        System.out.println(prefix.startsWith("a") + ": String does not begin with an 'a'");
        System.out.println(prefix.startsWith("I") + ": String does begin with an 'I'");
        System.out.println("--------------------------");


        /**
         * Scenario 5
         * 
         * Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         * @param oldChar (char)
         * @param newChar (char)
         * @return replacedString (String)
         */
        // Write your code here

        System.out.println("Scenario 5 (replace function)\n");
        String replacedString = "Muhymmed Zeeshyyn Shyik";
        System.out.println(replacedString + " - replacing 'y' with 'a' - " + replacedString.replace('y', 'a'));
        System.out.println("--------------------------");

        
        /**
         * Scenario 6
         * 
         * Find a built-in function that calculates the square root of a number.
         * @param number (double)
         * @return squareRoot (double)
         */
        // Write your code here

        System.out.println("Scenario 6 (square root)\n");
        double number = 25;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " is = " + squareRoot);
        System.out.println("--------------------------");


        /**
         * Scenario 7
         * 
         * Find a built-in function that calculates the power of a number.
         * @param base (double)
         * @param exponent (double)
         * @return power (double)
         */
        // Write your code here

        System.out.println("Scenario 7 (power)\n");
        double base = 7;
        double power = 2;
        double exponent = Math.pow(base, power);
        System.out.println(base + " to the power of " + power + " is = " + exponent);
        System.out.println("--------------------------");


        /**
         * Scenario 8
         * 
         * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         * @return randomNumber (double)
         */
        // Write your code here

        System.out.println("Scenario 8 (random # from 0.0 < 1)\n");
        double randomNumber = Math.random();
        System.out.println("Random number = " + randomNumber);
        System.out.println("--------------------------");



        /**
         * Scenario 9
         * 
         * Find a built-in function that returns the larger of two numbers.
         * @param number1 (int)
         * @param number2 (int)
         * @return maxNumber (int)
         */
        // Write your code here

        System.out.println("Scenario 9 (largest of the two)\n");
        int number1 = 7;
        int number2 = 5;
        System.out.println("Between " + number1 + " & " + number2 + ". " + Math.max(number1, number2) + " is the largest");
        System.out.println("--------------------------");


    }
}
