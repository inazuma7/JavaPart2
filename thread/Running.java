package thread;

public class Running extends Thread {
		  public static void main(String[] args) {
			  
		    Running thread = new Running();
		    thread.start();
		    // print by the main thread 
		    System.out.println("This code is outside of the thread");
		  }
		  
		  
		  public void run() {
			//print by the new thread created by calling start().
		    System.out.println("This code is running in a thread");
		  }
		
}
