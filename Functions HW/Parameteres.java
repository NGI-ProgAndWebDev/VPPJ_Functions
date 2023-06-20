public class Parameteres {

    public static void main(String[] args) {
        
        calcArea(2.3, 3.6);
        calcArea(1.7, 2.8);
        calcArea(2.2, 4.2);

    }
    
    public static void calcArea(double L, double W) { // L = length & W = width

        double area = L * W;

        System.out.println("Area: " + area);
    }

    public String toString() {

        return "Parameteres[]";

    }
}
