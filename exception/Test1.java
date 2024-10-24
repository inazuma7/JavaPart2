package exception;

public class Test1 {
	    public static void main(String[] args) {
	        try {
	            int result = 10 / 0;  // This will cause an ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!");
	        } finally {
	            System.out.println("This will always execute.");
	        }
	    }
	

}
