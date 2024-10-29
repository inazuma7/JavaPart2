
import java.util.Scanner;

public class BalancedFormatter {

    // Method to format a number according to "6:2" format
    public static String formatBalance(String balanceRaw) {
        // If the input is empty or shorter than 3 characters, default to "0.00"
        if (balanceRaw.isEmpty() || balanceRaw.length() < 3) {
            return "0.00";
        }

        // Remove any non-numeric characters just in case
        balanceRaw = balanceRaw.replaceAll("[^0-9]", "");

        // Separate the integer and decimal parts
        String integerPart = balanceRaw.substring(0, balanceRaw.length() - 2); // All digits except the last two
        String decimalPart = balanceRaw.substring(balanceRaw.length() - 2);    // Last two digits

        // Format the output as integerPart.decimalPart
        return integerPart + "." + decimalPart;
    }

    // Main method to test the formatBalance function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (without a decimal point): ");
        String input = scanner.nextLine();

        // Format the balance
        String formattedBalance = formatBalance(input);
        
        // Print the formatted balance
        System.out.println("Formatted Balance: " + formattedBalance);

        // Close the scanner
        scanner.close();
    }
}

