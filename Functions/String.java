public class String {
    public static void main(String[] args) {
        /**
         * Scenario 4
         * Find a built in function that checks if a string starts with a specific prefix
         * @param prefix(String)
         * @return startsWithPrefix(boolean)
         */
        
    java.lang.String str = "Hello World";
    java.lang.String prefix = "Hello";

    boolean startsWithPrefix = str.startsWith(prefix);
    System.out.println("Does the string start with the prefix?" + startsWithPrefix);

    
    }
}
