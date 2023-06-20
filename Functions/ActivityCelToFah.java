public class ActivityCelToFah {
    public static void main(String[] args) {
        double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }

    private static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];

        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (double) (celsius[i] / 5 * 9) + 32;
        }

        return (double[]) fahrenheit;
    }

    private static void printTemperatures(double[] temps, String tempType) {
        System.out.print(tempType + ": ");

        for (double t : temps) {
            System.out.print(t + " ");
        }

        System.out.println("\n");
    }
}
