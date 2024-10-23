//Write a Java program to validate a personal identification number (PIN). Assume a PIN number is 4, 6 or 8

package regex;

public class Test3 {
	 
	   public static void main(String[] args) {	   
		    String n = "123";
			System.out.println("Original PIN Number: "+n);
			System.out.println("Is the said PIN number is valid? "+validate(n));
		    n = "1234";
			System.out.println("Original PIN Number: "+n);
			System.out.println("Is the said PIN number is valid? "+validate(n));
		    n = "12345";
			System.out.println("Original PIN Number: "+n);
			System.out.println("Is the said PIN number is valid? "+validate(n));	
		    n = "123456";
			System.out.println("Original PIN Number: "+n);
			System.out.println("Is the said PIN number is valid? "+validate(n));
		    n = "1234567";
			System.out.println("Original PIN Number: "+n);
			System.out.println("Is the said PIN number is valid? "+validate(n));	    
			n = "12345678";
			System.out.println("Original PIN Number: "+n);
			System.out.println("Is the said PIN number is valid? "+validate(n));
			n = "123456789";
			System.out.println("Original PIN Number: "+n);
			System.out.println("Is the said PIN number is valid? "+validate(n));		
	        }

	   public static boolean validate(String n) {
		   return n.matches("\\d{4}|\\d{6}|\\d{8}");
	   }
	}
