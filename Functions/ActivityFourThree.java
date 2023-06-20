public class ActivityFourThree {
    // Task 1
    /**
     * Function name : fahrenheitToCelcius
     * 
     * Inside the function:
     * returns celcius temperature: C = (F - 32)* 5/9
     * 
     */
    public static double fahrenheitToCelsius(double Farenheit) {
        return (Farenheit - 32) * 5 / 9;

    }

    public static void printTemperature(double Farenheit) {
        System.out.println("F=" + Farenheit + "F");
        System.out.println("C= " + fahrenheitToCelsius(Farenheit) + "°C\n");

    }

    public static void main(String[] args) {
        // temperature in fahrenheit
        double noon = 77;
        double evening = 61;
        double midnight = 55;
        printTemperature(noon);
        printTemperature(evening);
        printTemperature(midnight);
        
    }
}
