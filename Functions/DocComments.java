public class DocComments{

    public static void main(String[] args) {
        
    }

    /*
    Function Name: greet

    Inside Function - prints hi
     */
    public static void greet() {
        System.out.println("Hello");
    }

/**
 * Function Name: printText
 * 
 * 
 */
public static void printText(String name, String age){
    System.out.println("Hi, i am " +name+ "and i am "+age+ "years old");
}

/**
 * Function name: calculateArea
 * @param length
 * @param width
 * @return
 */

public static double calculateArea(double length, double width)
{
    double area = length * width;
    return area;