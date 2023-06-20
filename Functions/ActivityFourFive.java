import java.util.Scanner;

import javax.swing.SortOrder;

public class ActivityFourFive {

    public static void areaSquare() {
        double side;
        double area = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("AREA OF A SQUARE");

        System.out.println("Enter the side value: ");
        side = scan.nextDouble();
        // area = side ^ 2
        if (side < 0) {
            System.out.println("Error, impossible");
        } else {
            area = Math.pow(side, 2);
        }
        System.out.println("Area of Square: " + area);
        System.out.println("_____________________________\n");    }

    public static void areaRectangle() {
        double length;
        double width;
        double Area = 0;
        Scanner scan = new Scanner(System.in);
        Scanner Scan = new Scanner(System.in);
        System.out.println("AREA OF A RECTANGLE");
        System.out.println("Enter the length: ");
        length = scan.nextDouble();
        System.out.println("Enter the width: ");
        width = Scan.nextDouble();

        if (length < 0 || width < 0) {
            System.out.println("Error. Impossible");

        } else {
            Area = length * width;

        }
        System.out.println("Area of Rectangle: " + Area);
        System.out.println("_____________________________\n");
    }

    public static void areaTriangle() {
        double base;
        double height;
        double area = 0;

        Scanner scan = new Scanner(System.in);
        Scanner Scan = new Scanner(System.in);
        System.out.println("AREA OF A TRIANGLE ");
        System.out.println("Enter the base: ");
        base = scan.nextDouble();
        System.out.println("Enter the height: ");
        height = Scan.nextDouble();

        if (base < 0 || height < 0) {
            System.out.println("Error, impossible");
        } else {
            area = base * (height / 2);
        }
        System.out.println("Area of Triangle : " + area);
        System.out.println("_____________________________\n");
    }

    public static void areaCircle() {
        double area = 0;
        double radius;
        final double PI;

        Scanner scan = new Scanner(System.in);

        System.out.println("AREA OF A CIRCLE");
        System.out.println("Enter the raduis: ");
        radius = scan.nextDouble();

        if (radius < 0) {
            System.out.println("Error, impossible");

        } else {
            area = Math.PI * Math.pow(radius, 2);
        }
        System.out.println("Area of Circle : " + area);
        System.out.println("_____________________________\n");
    }

    public static void printFunctions() {

        areaSquare();
        areaRectangle();
        areaTriangle();
        areaCircle();
    }

    public static void main(String[] args) {
        printFunctions();
        ;
    }
}
