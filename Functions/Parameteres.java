public class Parameteres {
    public static void main(String[] args) {

    double length;
    double width;
    
        calculateArea(length:2.3, width:3.6);
        calculateArea(length:1.7, width:2.8);
        calculateArea(length:2.2, width:4.2);
    }
    
    public static void calculateArea(double length, double width) {
        double area = length * width;

        System.out.println("Area: "+ area);
    }
    @Override
    public String toString() {
        return "Parameters []";

        
    }
}
