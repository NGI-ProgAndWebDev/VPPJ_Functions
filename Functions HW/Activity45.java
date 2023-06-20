public class Activity45 {

    // Task 1: calc the area of a square

    /**
     * Function name: areaSquare -
     * 
     * @param side
     * @return
     */
    public static double areaSquare(double side) {

        if (side < 0) {
            System.out.println("Error!: Impossible!");
            System.exit(0);
        }
        return side * side;

    }

    // Task 2: calc the area of a rectangle

    /**
     * Function name: areaRectangle -
     * 
     * @param length
     * @param width
     * @return
     */
    public static double areaRectangle(double length, double width) {

        if (length < 0 || width < 0) {
            System.out.println("Error!: Impossible!");
            System.exit(0);
        }
        return length * width;

    }

    // Task 3: calc the area of a triangle

    /**
     * Function name: areaTriangle -
     * 
     * @param base
     * @param height
     * @return
     */
    public static double areaTriangle(double base, double height) {

        if (base < 0 || height < 0) {
            System.out.println("Error!: Impossible!");
            System.exit(0);
        }
        return base * height / 2;
    }

    // Task 4: calc the area of a circle

    /**
     * Function name: areaCircle -
     * 
     * @param radius
     * @return
     */
    public static double areaCircle(double radius) {

        if (radius < 0) {
            System.out.println("Error!: Impossible!");
            System.exit(0);
        }
        return Math.PI * radius * radius;

    }

    // Task 6: print the areas

    /**
     * Function name: printAreas - prints all the calculated areas for
     * all the shapes
     * 
     * @param square
     * @param rectangle
     * @param triangle
     * @param circle
     */
    public static void printAreas(double square, double rectangle, double triangle, double circle) {

        System.out.println("Square area: " + square + "\n");
        System.out.println("Rectangle area: " + rectangle + "\n");
        System.out.println("Triangle area: " + triangle + "\n");
        System.out.println("Circle area: " + circle + "\n");

    }

    public static void main(String[] args) {

        // Task 5: calc the area
        double square = areaSquare(4);
        double rectangle = areaRectangle(3, 7);
        double triangle = areaTriangle(5, 12);
        double circle = areaCircle(4);

        // Task 7: call the printArea function
        printAreas(square, rectangle, triangle, circle);

        System.out.println("Thank you for using the area calculator");
    }

}
