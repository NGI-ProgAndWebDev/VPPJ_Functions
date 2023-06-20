public class Temperature {
    /**
 * Function name: printTemperatures
 * @param fahrenheit (double)
 *
 * Inside the function:
 * 1. prints the Fahrenheit value: "F: <temp in Fahrenheit>".
 * 2. calls fahrenheitToCelsius and prints the Celsius value: "C: <temp in Celsius> \n".
 */
public void printTemperatures(double fahrenheit) {
    System.out.println("F: " + fahrenheit);
    double celsius = fahrenheitToCelsius(fahrenheit);
    System.out.println("C: " + celsius + "\n");
}
private double fahrenheitToCelsius(double fahrenheit) {
        return 0;
    }
public static void main(String[] args) {
    double noon = 77;     // temperature in Fahrenheit
    double evening = 61;  // temperature in Fahrenheit
    double midnight = 55; // temperature in Fahrenheit

    // Create an instance of the class
    Temperature converter = new Temperature();

    // Call the printTemperatures function for each temperature
    converter.printTemperatures(noon);
    converter.printTemperatures(evening);
    converter.printTemperatures(midnight);
}

}
