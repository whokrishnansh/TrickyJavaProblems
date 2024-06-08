//Question: you need to convert an integer n into a string s and then check if the conversion was successful. If the conversion is successful, the code should print "Good job"; otherwise, it should print "Wrong answer".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int n = scanner.nextInt();

        // Convert the integer to a string
        String s = String.valueOf(n);

        // Verify the conversion and print the appropriate message
        if (s.equals(String.valueOf(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        // Close the scanner
        scanner.close();
    }
}
