package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSong {
    public BufferedWriterSong(FileWriter fileWriter) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        String filePath = "test.txt";
        String[] poemLines = {
        		"Twinkle Twinkle, Little Star",
        		"How I wonder what you are",
        		"Up above the world so high",
        		"Like a diamond in the sky",
        		"Twinkle Twinkle Little Star",
        		"How I wonder what you are!."
        };

        try (
            // Create a BufferedWriter for writing to the file
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))
        ) {
            // Write each line of the poem to the file
            for (String line : poemLines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a newline character after each line
            }
            System.out.println("Song has been written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
