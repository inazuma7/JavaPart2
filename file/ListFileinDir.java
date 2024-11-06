package file;

import java.io.File;

public class ListFileinDir {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "D:\\Java\\Tutorial"; 

        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Check if the directory exists and is actually a directory
        if (directory.exists() && directory.isDirectory()) {
            // List all files and directories in the directory
            File[] filesList = directory.listFiles();

            // Loop through the list and print the file names
            if (filesList != null) {
                for (File file : filesList) {
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                    } else if (file.isDirectory()) {
                        System.out.println("Directory: " + file.getName());
                    }
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a directory or doesn't exist.");
        }
    }
}
