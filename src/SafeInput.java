import java.util.Scanner;

public class SafeInput {

    /**
     * Ensures user enters a non-zero length string.
     * @param pipe Scanner object
     * @param prompt Message to display
     * @return A valid non-empty string
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set to zero length, loop runs until valid input
        do {
            System.out.print("\n" + prompt + ": "); // Show prompt
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * Ensures user enters a valid integer.
     * @param pipe Scanner object
     * @param prompt Message to display
     * @return A valid integer
     */
    public static int getInt(Scanner pipe, String prompt) {
        int number = 0;
        boolean isValid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.next(); // Read and discard the invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!isValid);
        return number;
    }

    /**
     * Ensures user enters a valid double.
     * @param pipe Scanner object
     * @param prompt Message to display
     * @return A valid double
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double number = 0.0;
        boolean isValid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid decimal number.");
                pipe.next(); // Read and discard the invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!isValid);
        return number;
    }
}

