package exerciseFile;

import java.util.regex.*;

public class RegexParse {
    public static void main(String[] args) {
        String csv = "John Doe,30,Engineer;Jane Smith,25,Designer";
        String csvRegex = "(\\w+\\s\\w+),(\\d+),(\\w+)";
        Pattern pattern = Pattern.compile(csvRegex);
        Matcher matcher = pattern.matcher(csv);

        while (matcher.find()) {
            System.out.println("Name: " + matcher.group(1));
            System.out.println("Age: " + matcher.group(2));
            System.out.println("Occupation: " + matcher.group(3));
            System.out.println("-------------");
        }
    }
}
