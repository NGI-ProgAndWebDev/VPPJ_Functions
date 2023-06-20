public class DocComments {
    
    public static void main(String[] args) {
        
    }
    /*
     * Function name: greet
     * 
     * Inside Function - prints hi
     */
    public static void greet() {
       System.out.println("Hello"); 
    }

    /*
     * Fuction name: printText
     * 
     * @param name
     * @param age
     */
public static void printText(String name, String age) {
    System.out.println("Hi, I am" + name + "and I am" + age + "years old");
    
}
public static double calculateArea(double length , double width) {
   double area =  length * width;
   return area;
}
}
