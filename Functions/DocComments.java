public class DocComments {
    public static void main(String[] args) {
      greet();
      printText("Dharusha", "19");
 calculateArea(2.5, 7.2);
 
    }
/*
 * Function name : greet
 * 
 * Inside function : prints hello 
 */
    public static void greet() {
System.out.println("Hello");
        
    }
/**
 * Function name : printText
 * @param name
 * @param age
 */

    public static void printText(String name, String age ) {
        System.out.println("Hello, I am "  + name + " and " + "I am " + age + " years old");

    }

/**
 * Function name : calculateArea
 * @param length
 * @param width
 * @return
 */
    public static double calculateArea(double length, double width) {
//void methods dont return a value thoerefore we change void to double 
        double area = length * width ; 
        return area; 
        
    }
}
