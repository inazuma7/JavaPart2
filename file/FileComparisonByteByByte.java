package file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileComparisonByteByByte {
    public static void main(String[] args) {
        String file1Path = "filename.csv";
        String file2Path = "filename.txt";

        try {
            if (compareFilesByteByByte(file1Path, file2Path)) {
                System.out.println("Files are identical.");
            } else {
                System.out.println("Files are different.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while comparing files.");
            e.printStackTrace();
        }
    }

    public static boolean compareFilesByteByByte(String file1Path, String file2Path) throws IOException {
        try (
            FileInputStream fis1 = new FileInputStream(file1Path);
            FileInputStream fis2 = new FileInputStream(file2Path)
        ) {
            int byte1, byte2;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    return false;  // Files are different
                }
            }
            // Ensure both files have been fully read
            return fis1.read() == -1 && fis2.read() == -1;
        }
    }
}
