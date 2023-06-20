public class ActivityTemperatures {
    public static void main(String[] args) {
        double noon = 77; // temperature in fahrenheit.
        double evening = 61; // temperature in fahrenheit
        double midnight = 55; // temperature in fahrenheit

        printTemperature(noon);
        printTemperature(evening);
        printTemperature(midnight);
    }

    public static double farenheitToCelsius(double f) {
        return (f - 32) * 5/9; 
    }

    public static void printTemperature(double f) {
        System.out.println("F: " + f + "°F");
        System.out.println("C: " + farenheitToCelsius(f) + "°C");
    }
}
