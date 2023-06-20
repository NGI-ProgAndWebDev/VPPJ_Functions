import java.util.Arrays;

public class TemperatureConverter {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);
        
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }
    
    public static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];
        
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i] / 5.0 * 9.0) + 32.0;
        }
        
        return fahrenheit;
    }
    
    public static void printTemperatures(double[] temp, String tempType) {
        System.out.print(tempType + ": ");
        
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        
        System.out.println();
    }
}

