package file;

import java.io.*;

public class SongFile {
    public static void main(String[] args) {
        String originalFilePath = "song.txt";
        String updatedFilePath = "newsong.txt";

        // call writeSong method
        writeSong(originalFilePath);

        // using replaceCharacter() to change char 
        replaceCharacter(originalFilePath, updatedFilePath, 'I', 'U','i','u');

        // call read file methond
        readFile(updatedFilePath);
    }

    //write song method
    public static void writeSong(String filePath) {
        String[] songLines = {
        		"Twinkle Twinkle, Little Star",
        		"How I wonder what you are",
        		"Up above the world so high",
        		"Like a diamond in the sky",
        		"Twinkle Twinkle Little Star",
        		"How I wonder what you are!."
        };

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : songLines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a newline 
            }
            System.out.println("Song has been written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // replace char 
    public static void replaceCharacter(String inputFilePath, String outputFilePath, char oldChar1, char newChar1, char oldChar2, char newChar2) {
        try (
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String updatedLine = line.replace(oldChar1, newChar1).replace(oldChar2, newChar2);
                bufferedWriter.write(updatedLine);
                bufferedWriter.newLine();
            }
            System.out.println("Characters '" + oldChar1 + "' have been replaced with '" + newChar1 + "' in " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void readFile(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading from " + filePath + ":");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

