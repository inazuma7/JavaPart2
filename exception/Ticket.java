package exception;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            // check age and price, if age valid, then print price and return
            double ticketPrice = calculateTicketPrice(age);
            System.out.println("Your ticket price is: $" + ticketPrice);
          
            //if the format age not valid,the system will print error and return
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for age!");
        } finally {
            System.out.println("Thank you!");
            scanner.close();
        }
    }

    // Method to calculate ticket price based on age
    private static double calculateTicketPrice(int age) {
        if (age < 5) {
            return 0.0; 
        } else if (age >= 5 && age <= 17) {
            return 5.0; 
        } else if (age >= 18 && age <= 59) {
            return 10.0; 
        } else {
            return 7.0; 
        }
    }
}

