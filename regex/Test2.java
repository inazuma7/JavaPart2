package regex;
import java.util.regex.*;

	public class Test2 {
	    public static void main(String[] args) {
	        String email = "example@example.com";
	        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	        
	        Pattern pattern = Pattern.compile(regex);//pattern object
	        Matcher matcher = pattern.matcher(email);//matcher object
	        
	        //check matcher = pattern
	        if (matcher.matches()) {
	            System.out.println("Valid email address.");
	        } else {
	            System.out.println("Invalid email address.");
	        }
	    }
	

}
