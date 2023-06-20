public class Weather {

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void printTemperatures(double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("C: " + celsius);
    }

    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55; 
        
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }
}
