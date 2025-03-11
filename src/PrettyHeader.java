import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get user message
        System.out.print("Enter your message for the header: ");
        String message = in.nextLine();

        // Print formatted header
        SafeInput.prettyHeader(message);
    }
}
