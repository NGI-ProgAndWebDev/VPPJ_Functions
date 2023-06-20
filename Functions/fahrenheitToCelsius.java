public class fahrenheitToCelsius {

    public static void main(String[] args) {
        double noon = 77; // temperature in Fahrenheit
        double evening = 61; // temperature in Fahrenheit
        double midnight = 55; // temperature in Fahrenheit

        double noonCelsius = fahrenheitToCelsius(noon);
        double eveningCelsius = fahrenheitToCelsius(evening);
        double midnightCelsius = fahrenheitToCelsius(midnight);

        System.out.println("Noon Temperature in Celsius: " + noonCelsius);
        System.out.println("Evening Temperature in Celsius: " + eveningCelsius);
        System.out.println("Midnight Temperature in Celsius: " + midnightCelsius);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static void printTemperatures(double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("C: " + celsius + "\n");
    }
}
