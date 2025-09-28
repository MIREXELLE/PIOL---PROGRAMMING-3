package Activity_4;

import java.util.Scanner;

/**
 * Program to check if a number is divisible by 5.
 * Outputs "DIVISIBLE" if the number is divisible by 5,
 * otherwise outputs "NOT DIVISIBLE".
 */

public class number2 {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();

        // Check if the number is divisible by 5 using modulo operator
        if (num1 %5 == 0){
            System.out.println(num1 + " is divisible by 5");
        } else {
            System.out.println(num1 + " is not divisible by 5");
        }
    }
}