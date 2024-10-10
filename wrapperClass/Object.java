package wrapperClass;

public class Object {
		  public static void main(String[] args) { 
		    Integer myInt = 5; 
		    Double myDouble = 5.99; 
		    Character myChar = 'A'; 
		    
		    
		    /* standard wrapper class
		    System.out.println(myInt);
		    System.out.println(myDouble);
		    System.out.println(myChar);*/
		    
		    
		    //calls the method of the class, 
            // returns the value of the object and prints.
		    // eg, method; intValue(), return Integer of Object(5) and print 5
		    System.out.println(myInt.intValue());
		    System.out.println(myDouble.doubleValue());
		    System.out.println(myChar.charValue());
		  }
		

}
