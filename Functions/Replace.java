public class Replace {
    public static void main(String[] args) {
        /**
         * Scenario 5
         * Find a built in function that replaces all occurances of a 
         * specified character in a string with another character.
         * @param oldChar (char)
         * @param newChar (char)
         * @return replacedString(String)
         */
        //Write code here
        java.lang.String originalString = "Hello World";
        char charToReplace = 'o';
        char replacementChar = '*';

        java.lang.String replacedString = originalString.replace(charToReplace, replacementChar);
        System.out.println("Original string: " + originalString);
        System.out.println("Replaced string: " + replacedString);
    }
}
