package Activity_5;
// 5. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.Scanner;

public class Number_5 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Declare variables: n for count, num for each input, sumEven and sumOdd for results
        int n, num, sumEven = 0, sumOdd = 0;

        // Prompt for the number of integers
        System.out.print("Enter the number of integers to process: ");

        // Read and validate the count
        n = scanner.nextInt();
        if (n <= 0) {
            // If invalid, display error and exit
            System.out.println("Invalid input. Please enter a positive integer for the count.");
            scanner.close();
            return;
        }

        // Prompt for the integers
        System.out.println("Enter " + n + " integers:");

        // Loop to read n integers
        for (int i = 0; i < n; i++) {
            // Read each integer
            num = scanner.nextInt();

            // Check if even or odd and add to respective sum
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        // Display the sums
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

        // Close the scanner
        scanner.close();
    }
}