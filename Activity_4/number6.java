package Activity_4;

import java.util.Scanner;

/*
 * 6. Write a program that will determine if the input number is ODD or EVEN. Display also
 * the word ODD if the number is odd, EVEN if the number is even.
 */
public class number6 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number to know if it's odd or even: ");
        int num = in.nextInt();

        // Check if number is even or odd using modulo operator
        // If remainder when divided by 2 is 0, it's even, otherwise odd
        if (num % 2 == 0){
            System.out.println(num + " is a EVEN number");
        } else {
            System.out.println(num + " is a ODD number");
        }
        in.close();
    }
}