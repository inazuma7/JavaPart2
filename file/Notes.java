package file;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        int choice;

        System.out.println("Enter the name of the file (with extension, e.g., txt, csv & xml ):");
        fileName = scanner.nextLine();

        do {
        	
            System.out.println("\nChoose one number:");
            System.out.println("1 - Create a file");
            System.out.println("2 - Write note to the file");
            System.out.println("3 - Read note from the file");
            System.out.println("4 - Check if the file exists");
            System.out.println("5 - Delete the file");
            System.out.println("6 - View all files in the current directory");
            System.out.println("7 - Exit");
            System.out.print("Enter your choice: ");

            // user input file name
            choice = scanner.nextInt();
            scanner.nextLine();

            // switch
            switch (choice) {
                case 1:
                    createFile(fileName);
                    break;
                case 2:
                    System.out.println("Enter note to write:");
                    String content = scanner.nextLine();
                    writeFile(fileName, content);
                    break;
                case 3:
                    readFile(fileName);
                    break;
                case 4:
                    checkFileExists(fileName);
                    break;
                case 5:
                    deleteFile(fileName);
                    break;
                case 6:
                    listFilesInDirectory(".");
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 7.");
            }
        } while (choice != 7); // not exit until the user choose 7

        scanner.close();
    }

    // Method to create a file
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Method to write to a file
    public static void writeFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote note to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read from a file
    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Reading from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to check if the file exists
    public static void checkFileExists(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }
    }

    // Method to delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Method to list all files in a directory
    public static void listFilesInDirectory(String directoryName) {
        File directory = new File(directoryName);
        File[] filesList = directory.listFiles();

        if (filesList != null && filesList.length > 0) {
            System.out.println("Files in the directory:");
            for (File file : filesList) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                }
            }
        } else {
            System.out.println("The directory is empty or does not exist.");
        }
    }
}


