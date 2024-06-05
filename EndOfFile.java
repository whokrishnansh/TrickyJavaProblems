//Question: The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.

//Answer:

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input (System.in)
        Scanner scanner = new Scanner(System.in);

        // Line counter
        int lineNumber = 1;

        // Read input until EOF
        while (scanner.hasNextLine()) {
            // Read the next line
            String line = scanner.nextLine();

            // Print the line number and the line content
            System.out.println(lineNumber + " " + line);

            // Increment the line counter
            lineNumber++;
        }

        // Close the scanner
        scanner.close();
    }
}
