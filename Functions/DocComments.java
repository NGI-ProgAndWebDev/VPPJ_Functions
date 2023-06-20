public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function name: greet
     * 
     * Inside function - prints hi
     */
    private static void greet() {
        System.out.println("Hello");
    }

    /**
     * Prints out the parsed name and age.
     * 
     * @param name The user's name
     * @param age The user's age
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old");
    }

    /**
     * Calculates the area of the length and width provided
     * 
     * @param length the length that you provide
     * @param width the width that you provide
     * @return the calculated area
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
        
    }
}