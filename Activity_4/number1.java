package Activity_4;

import java.util.Scanner;

/*
 * Program to check if the input number is POSITIVE or NEGATIVE.
 * Consider 0 as a positive number.
 * Displays the word POSITIVE or NEGATIVE based on the input.
 */
public class number1 {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // Check if the number is positive (including 0) or negative
        if (num >= 0) {
            System.out.println("POSITIVE");
        } else {
            System.out.println("NEGATIVE");
        }
        in.close();
    }
}