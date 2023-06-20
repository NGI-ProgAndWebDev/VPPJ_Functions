public class DocComments {
    
}
/**
 * Function Name
 * 
 *Inside Function - prints hi
 */
public static void greet() {
    System.out.println("Hello");
    
}
/**
 * 
 * @param name
 * @param age
 */
public static void main(String name, String age) {
    System.out.println("Hi, i am" + name + " and I am "+ age + " years old");
    
}
 /**
  * 
  * @param length
  * @param width
  * @return
  */
public static double calculateArea(double length, double width) {
    double area = length * width;
    return area;
}