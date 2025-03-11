public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");
        System.out.println("--------------------");

        // Loop through -100 to 100 degrees Celsius
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%-10d %-10.2f%n", celsius, fahrenheit);
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
