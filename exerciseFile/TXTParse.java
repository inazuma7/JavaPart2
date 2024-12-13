package exerciseFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TXTParse {
    public static void main(String[] args) {
    	String inputFile = "D:\\Java\\Tutorial\\src\\exerciseFile\\TXTData.txt"; // Update this path
        String outputFile = "D:\\Java\\Tutorial\\src\\exerciseFile\\TXTOutput.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int userCount = 1;

            // Read each line of the TXT file
            while ((line = reader.readLine()) != null) {
                // Use substring to extract fields based on fixed-length positions
                String name = line.substring(0, 20).trim(); // Name occupies first 20 characters
                String age = line.substring(20, 25).trim(); // Age occupies next 5 characters
                String email = line.substring(25, 55).trim(); // Email occupies last 30 characters

                // Write the parsed values to the output file
                writer.write("User " + userCount);
                writer.newLine();
                writer.write("Name: " + name);
                writer.newLine();
                writer.write("Age: " + age);
                writer.newLine();
                writer.write("Email: " + email);
                writer.newLine();
                writer.write("-----------------------------");
                writer.newLine();

                // Increment the user count
                userCount++;
            }

            System.out.println("Data has been successfully written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
