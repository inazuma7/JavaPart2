//Write a Java program to create a basic Java thread that prints " Hello, World!" when executed.

package thread;

public class HelloThread extends Thread {
	  @Override
	  public void run() {
	    System.out.println("Hello, World!");
	  }
	  
	  public static void main(String[] args) {
	    HelloThread thread = new HelloThread();
	    
	    //calling thread
	    thread.start();
	  }
	}

