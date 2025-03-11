import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get SSN input
        String ssn = SafeInput.getRegExString(in, "Enter a valid SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN entered: " + ssn);

        // Get UC Student M number
        String mNumber = SafeInput.getRegExString(in, "Enter a UC Student M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("Valid M number entered: " + mNumber);

        // Get menu choice
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu option (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Valid menu choice entered: " + menuChoice);
    }
}
