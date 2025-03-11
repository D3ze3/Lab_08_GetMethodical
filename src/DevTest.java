import java.util.Scanner;  // Ensure Scanner is imported

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Scanner for user input

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + age);

        // Test getDouble
        double price = SafeInput.getDouble(in, "Enter the price of an item");
        System.out.println("You entered: " + price);
    }
}

