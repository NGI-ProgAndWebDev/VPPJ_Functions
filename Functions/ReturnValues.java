public class ReturnValues {
    /**
     * 
     * @param args
     */    public static void main (String [] args){
            double area1 = calculateArea(2.3, 3.6);
            printArea(2.3, 3.6, area1);
            calculateArea(1.7, 2.8);
            calculateArea(2.2, 4.2);
    
            calculateArea(-5, 2.1);
    
            explainArea("English");
            explainArea("French");
            explainArea("Spanish");
            explainArea("Italian");    }
    
        
    /**
     * Function name: calculateArea
     * Calculates area of rectangle
     * @param length
     * @param width
     * @return
     */
        public static double calculateArea(double length, double width){
            if (length < 0 || width < 0 ) {
                System.out.println("Invalid measurments entered");
                System.exit(0);
            }
            double area = length * width;
            return area;
        }
    
        /**
         * Function Name: explainArea
         * @param language
         * @return
         */
    
        public static String explainArea(String language){
            switch (language){
                case "English": return "Area equals length * width";
                case "French": return "la surface est eqale e la longueur * la laguare";
                case "Spanish": return "Area es igual a largo 8 ancho";
                default: return "Language not available";
            }
        }
    /**
     * Prints out a sentence that makes it easy to understand
     * @param length
     * @param width
     * @param area
     */
        public static void printArea(double length, double width, double area){
            System.out.println("A rectangle with a length of "+ length +" and a width of "+ width + " has an area of " + area);
        }
    }
    