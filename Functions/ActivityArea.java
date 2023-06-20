public class ActivityArea {
    public static void main(String[] args) {
        printAreas();
    }

    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("Impossible");
            System.exit(0);
        }
        return (double) Math.pow(side, 2);
    }

    public static double areaRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Impossible");
            System.exit(0);
        }

        return (double) length * width;
    }

    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Impossible");
            System.exit(0);
        }

        return (double) (base * height) / 2;
    }

    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Impossible");
            System.exit(0);
        }

        return (double) Math.PI * Math.pow(radius, 2);
    }

    public static void printAreas() {
        System.out.println("The area of a square with side = 2cm is " + areaSquare(2) + "cm");
        System.out
                .println("The area of a rectangle with length = 1cm and width = 2cm is " + areaRectangle(1, 2) + "cm");
        System.out.println("The area of a triangle with base = 1cm and height = 2cm is " + areaTriangle(1, 2) + "cm");
        System.out.println("The area of a circle with radius = 2cm is " + areaCircle(2) + "cm");
    }
}
