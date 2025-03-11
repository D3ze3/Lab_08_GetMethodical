import java.util.Scanner;

public class SafeInput {

    public static String  getNonZeroLenString(Scanner pipe, String prompt) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear buffer
                return value;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Discard invalid input
            }
        }
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine(); // Clear buffer
                return value;
            } else {
                System.out.println("Invalid input. Please enter a decimal number.");
                pipe.next(); // Discard invalid input
            }
        }
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value;
        while (true) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear buffer
                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Error: Value out of range.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Discard invalid input
            }
        }
    }


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value;
        while (true) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine(); // Clear buffer
                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Error: Value out of range.");
                }
            } else {
                System.out.println("Invalid input. Please enter a decimal number.");
                pipe.next(); // Discard invalid input
            }
        }
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt + " [Y/N]: ");
            input = pipe.nextLine().trim().toLowerCase();
            if (input.equals("y")) return true;
            if (input.equals("n")) return false;
            System.out.println("Invalid input. Please enter 'Y' or 'N'.");
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        while (true) {
            System.out.print(prompt + ": ");
            input = pipe.nextLine().trim();
            if (input.matches(regEx)) {
                return input;
            } else {
                System.out.println("Invalid input. Please follow the required format.");
            }
        }
    }

    public static void prettyHeader(String msg) {
        final int WIDTH = 60; // Total width of the header
        final int PADDING = 3; // Fixed padding of asterisks on both sides

        // Print top border
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Calculate space for centering the message
        int messageLength = msg.length();
        int totalPadding = WIDTH - (messageLength + (PADDING * 2));
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;

        // Print centered message
        System.out.print("***");
        for (int i = 0; i < leftPadding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightPadding; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print bottom border
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}



