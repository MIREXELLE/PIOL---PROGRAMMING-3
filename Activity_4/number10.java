package Activity_4;

/*
10. Write a program that will convert and display the Letter grade to its equivalent message.
    Assign an appropriate error message if the input letter is not from A to F.
    Letter grade    Message
    A               EXCELLENT
    B               ABOVE AVERAGE
    C               AVERAGE
    D               BELOW AVERAGE
    F               FAILED
*/

import java.util.Scanner;

public class number10 {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a letter grade
        System.out.print("Enter your letter grade (A-F): ");
        String grade = in.next().toUpperCase(); // Convert input to uppercase for case insensitivity

        // Variable to store the equivalent message
        String message;

        // Using switch statement to determine the equivalent message for the letter grade
        switch (grade) {
            case "A":
                message = "EXCELLENT";
                break;
            case "B":
                message = "ABOVE AVERAGE";
                break;
            case "C":
                message = "AVERAGE";
                break;
            case "D":
                message = "BELOW AVERAGE";
                break;
            case "F":
                message = "FAILED";
                break;
            default:
                message = "INVALID GRADE - Please enter a letter from A to F";
                break;
        }

        // Display the equivalent message
        System.out.println("Grade " + grade + ": " + message);

        // Close the scanner
        in.close();
    }
}

/* Alternative implementation using enhanced switch (Java 14+):
 *
 * String message = switch (grade) {
 *     case "A" -> "EXCELLENT";
 *     case "B" -> "ABOVE AVERAGE";
 *     case "C" -> "AVERAGE";
 *     case "D" -> "BELOW AVERAGE";
 *     case "F" -> "FAILED";
 *     default -> "INVALID GRADE - Please enter a letter from A to F";
 * };
 *
 * This enhanced switch syntax is more concise and doesn't require the break statements,
 * making the code cleaner and less prone to errors caused by missing break statements.
 */