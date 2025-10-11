package Activity_5;
// 3. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;

public class Number_3 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Declare variables: num for input, reversed for result, originalNum to store input
        int num, reversed = 0, originalNum;

        // Prompt user for input
        System.out.print("Enter an integer to reverse its digits: ");

        // Read input
        num = scanner.nextInt();

        // Store the originalNum number for later output
        originalNum = num;

        // Check if the number is negative
        boolean isNegative = (num < 0);

        // If negative, make it positive for reversal process
        if (isNegative) num = -num;

        // While there are digits left in num
        while (num != 0) {
            // Extract the last digit
            int digit = num % 10;
            // Append the digit to reversed by shifting left (multiplying by 10) and adding digit
            reversed = reversed * 10 + digit;
            // Remove the last digit from num
            num /= 10;
        }

        // If originalNum was negative, make reversed negative
        if (isNegative) reversed = -reversed;

        // Display the result
        System.out.println("\nThe original number: " + originalNum + " \nReversed: " + reversed);

        // Close the scanner
        scanner.close();
    }
}