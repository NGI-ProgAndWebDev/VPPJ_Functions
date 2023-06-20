public class DocComments {
    
    public static void main(String[] args) {
        
    }

    /*
     * Function Name:greet
     * 
     * Inside Function - prints hi
     */
    public static void greet () {
        System.out.println("Hello");
    
        }
        /**
         * Function Name: printText
         * @param Name
         * @param Age
         */
    public static void printText(String Name, String Age) {
        System.out.println("Hi, i am" + Name + "and i am" + Age);
        
    }
    /**
     * Functin Name: calculateArea
     * @param length
     * @param width
     * @return
     */
    public static double calculateArea(double length, double width) 
    {
        double area = length*width;
        return area;


    

        
    }

}
