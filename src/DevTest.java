import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + age);

        // Test getDouble
        double price = SafeInput.getDouble(in, "Enter the price of an item");
        System.out.println("You entered: " + price);

        // Test getRangedInt
        int rangedInt = SafeInput.getRangedInt(in, "Enter a number between 1 and 10", 1, 10);
        System.out.println("You entered: " + rangedInt);

        // Test getRangedDouble
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a decimal between 0.5 and 5.5", 0.5, 5.5);
        System.out.println("You entered: " + rangedDouble);

        // Test getYNConfirm
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You selected: " + (confirm ? "Yes" : "No"));

        // Test getRegExString
        String email = SafeInput.getRegExString(in, "Enter your email", "^[A-Za-z0-9+_.-]+@(.+)$");
        System.out.println("Valid email entered: " + email);
    }
}


