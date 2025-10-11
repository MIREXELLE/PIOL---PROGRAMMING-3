package Activity_5;
// 7. Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.
import java.util.Scanner;

public class Number_7 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Declare choice variable for user input
        char choice;

        // Start the do-while loop to perform the operation at least once
        do {
            // Declare variables for the two numbers
            int a, b;

            // Prompt for first number
            System.out.print("Enter the first number: ");

            // Read first number
            a = scanner.nextInt();

            // Prompt for second number
            System.out.print("Enter the second number: ");

            // Read second number
            b = scanner.nextInt();

            // Compute and display the sum
            System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));

            // Ask if user wants to continue
            System.out.print("Do you want to perform the operation again? (y/n): ");
            choice = scanner.next().charAt(0);
            // Continue loop if choice is 'y' or 'Y'
        } while (choice == 'y' || choice == 'Y');

        // Display termination message
        System.out.println("Program terminated.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}