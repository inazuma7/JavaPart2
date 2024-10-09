/* Inner Class:
Write a Java program to create an outer class called  Computer with an inner class Processor. 
The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed).
 Create an instance of Processor from the Computer class and call the "displayDetails()" method.*/

package innerClass;

//Outer class called Computer
class Computer {

 // Inner class called Processor
 class Processor {
     // Method to display processor details
     void displayDetails() {
         // Print details of the processor
         System.out.println("Processor Brand: Intel");
         System.out.println("Processor Speed: 3.5 GHz");
     }
 }

 // Method to create and display Processor details
 void showProcessorDetails() {
     // Create an instance of the inner class Processor
     Processor processor = new Processor();
     // Call the displayDetails() method
     processor.displayDetails();
 }

 // Main method to execute the program
 public static void main(String[] args) {
     // Create an instance of the outer class Computer
     Computer computer = new Computer();
     // Call the method to show processor details
     computer.showProcessorDetails();
 }
}

