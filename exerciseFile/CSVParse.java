package exerciseFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVParse {
    public static void main(String[] args) {
        String inputFile = "D:\\Java\\Tutorial\\src\\exerciseFile\\CSVData.txt";
        String outputFile = "D:\\Java\\Tutorial\\src\\exerciseFile\\CSVOutput.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            // Read the header line
            String headerLine = reader.readLine();
            if (headerLine != null) {
                writer.write("Header: " + headerLine);
                writer.newLine();
            }

            // Read each line of the CSV file
            while ((line = reader.readLine()) != null) {
                // Split the line by commas to extract fields
                String[] fields = line.split(",");

                // Write the parsed values to the output file
                writer.write("Name: " + fields[0]);
                writer.newLine();
                writer.write("Contact Number: " + fields[1]);
                writer.newLine();
                writer.write("Email: " + fields[2]);
                writer.newLine();
                writer.write("Account Number: " + fields[3]);
                writer.newLine();
                writer.write("Account Type: " + fields[4]);
                writer.newLine();
                writer.write("Balance: " + formatBalance(fields[5]));
                writer.newLine();
                writer.write("-----------------------------");
                writer.newLine();
            }
            System.out.println("Data has been successfully written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to format the balance according to the 6:2 format (e.g., 12345678 -> 123456.78)
    private static String formatBalance(String balanceRaw) {
        if (balanceRaw.isEmpty() || balanceRaw.length() < 3) {
            return "0.00";
        }
        // Separate the integer and decimal parts
        String integerPart = balanceRaw.substring(0, balanceRaw.length() - 2);
        String decimalPart = balanceRaw.substring(balanceRaw.length() - 2);
        return integerPart + "." + decimalPart;
    }
}

