public class Activity43 {

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celsius
     * 
     * @param fahrenheit
     * @return
     */
    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;

    }

    /**
     * Function name: printTemperature - prints the fahrenheit and celsius
     * equivalent
     * 
     * @param fahrenheit
     */
    public static void printTemperature(double fahrenheit) {

        System.out.println("Fahrenheit: " + fahrenheit + " F");
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Celsius: " + celsius + "°C\n");

    }

    public static void main(String[] args) {

        double noon = 77; // noon temp in F
        double evening = 61; // evening temp in F
        double midnight = 55; // midnight temp in F

        System.out.println("Noon");
        printTemperature(noon);
        System.out.println("Evening");
        printTemperature(evening);
        System.out.println("Midnight");
        printTemperature(midnight);

    }

}
