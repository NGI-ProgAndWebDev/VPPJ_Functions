public class AreaCalculator {
            public static void main(String[] args) {
            double square = areaSquare(2);
            double rectangle = areaRectangle(1, 2);
            double triangle = areaTriangle(1, 2);
            double circle = areaCircle(2);
    
            printAreas(square, rectangle, triangle, circle);
        }
    
        /**
         * Calculates the area of a square.
         * @param side the side length of the square.
         * @return the area of the square.
         */
        public static double areaSquare(double side) {
            if (side < 0) {
                System.out.println("Impossible");
                System.exit(0);
            }
            return side * side;
        }
    
        /**
         * Calculates the area of a rectangle.
         * @param length the length of the rectangle.
         * @param width the width of the rectangle.
         * @return the area of the rectangle.
         */
        public static double areaRectangle(double length, double width) {
            if (length < 0 || width < 0) {
                System.out.println("Error: impossible");
                System.exit(0);
            }
            return length * width;
        }
    
        /**
         * Calculates the area of a triangle.
         * @param base the base of the triangle.
         * @param height the height of the triangle.
         * @return the area of the triangle.
         */
        public static double areaTriangle(double base, double height) {
            if (base < 0 || height < 0) {
                System.out.println("Error: impossible");
                System.exit(0);
            }
            return base * height / 2;
        }
    
        /**
         * Calculates the area of a circle.
         * @param radius the radius of the circle.
         * @return the area of the circle.
         */
        public static double areaCircle(double radius) {
            if (radius < 0) {
                System.out.println("Impossible");
                System.exit(0);
            }
            return Math.PI * radius * radius;
        }
    
        /**
         * Prints the areas of different shapes.
         * @param square the area of the square.
         * @param rectangle the area of the rectangle.
         * @param triangle the area of the triangle.
         * @param circle the area of the circle.
         */
        public static void printAreas(double square, double rectangle, double triangle, double circle) {
            System.out.println("Square area: " + square);
            System.out.println("Rectangle area: " + rectangle);
            System.out.println("Triangle area: " + triangle);
            System.out.println("Circle area: " + circle);
        }
    }

