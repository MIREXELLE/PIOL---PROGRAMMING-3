package Activity_5;
// 6. Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
import java.util.Scanner;

public class Number_6 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Declare variables: num for input, isPrime flag (true or false)
        int num;
        boolean isPrime = true;

        // Prompt for input
        System.out.print("Enter a positive integer to check if it's prime: ");

        // Read and validate input
        num = scanner.nextInt();
        if (num <= 0) {
            // If invalid, display error and exit
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        // Special case: 1 is not prime
        if (num == 1) {
            isPrime = false;
        } else {
            // Loop from 2 to sqrt(num) to check for divisors
            for (int i = 2; i * i <= num; i++) {
                // If divisible, not prime
                if (num % i == 0) {
                    isPrime = false;
                    break;  // No need to check further
                }
            }
        }

        // Display result based on isPrime flag
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}