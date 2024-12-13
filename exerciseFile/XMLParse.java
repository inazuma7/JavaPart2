package exerciseFile;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class XMLParse {
    public static void main(String[] args) {
    	String inputFile = "D:\\Java\\Tutorial\\src\\exerciseFile\\XMLData.xml"; // Update this path
        String outputFile = "D:\\Java\\Tutorial\\src\\exerciseFile\\XMLOutput.xml";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Parse the XML file
            Document document = builder.parse(new File(inputFile));

            // Normalize the XML structure
            document.getDocumentElement().normalize();

            // Get a list of all User elements
            NodeList nodeList = document.getElementsByTagName("User");

            // Loop through each User node
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    // Extract data from XML
                    String name = element.getElementsByTagName("Name").item(0).getTextContent();
                    String contactNumber = element.getElementsByTagName("ContactNumber").item(0).getTextContent();
                    String email = element.getElementsByTagName("Email").item(0).getTextContent();

                    // Extract account data
                    Element accountElement = (Element) element.getElementsByTagName("Account").item(0);
                    String accountNumber = accountElement.getElementsByTagName("AccountNumber").item(0).getTextContent();
                    String accountType = accountElement.getElementsByTagName("AccountType").item(0).getTextContent();
                    String balanceRaw = accountElement.getElementsByTagName("Balance").item(0).getTextContent();

                    // Format the balance
                    String balanceFormatted = formatBalance(balanceRaw);

                    // Write the parsed values to the output file
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Contact Number: " + contactNumber);
                    writer.newLine();
                    writer.write("Email: " + email);
                    writer.newLine();
                    writer.write("Account Number: " + accountNumber);
                    writer.newLine();
                    writer.write("Account Type: " + accountType);
                    writer.newLine();
                    writer.write("Balance: " + balanceFormatted);
                    writer.newLine();
                    writer.write("-----------------------------");
                    writer.newLine();
                }
            }

            System.out.println("Data has been successfully written to " + outputFile);
        } catch (Exception e) {
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
