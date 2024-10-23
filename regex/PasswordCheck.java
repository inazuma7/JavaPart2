package regex;
import java.util.Scanner;
import java.util.regex.*;

	public class PasswordCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a password to check its strength: ");
	        String password = scanner.nextLine();

	        if (isValidPassword(password)) {
	            System.out.println("Password is strong.");
	        } else {
	            System.out.println("Password is weak" +
	                    "please include at least one uppercase letter, one lowercase letter, one number" + "also atleast 8 letters");
	        }

	        scanner.close();
	    }

	    // Method validate password
	    private static boolean isValidPassword(String password) {
	        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=.{8,}).*$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);
	        return matcher.matches(); 
	    }
	

}
