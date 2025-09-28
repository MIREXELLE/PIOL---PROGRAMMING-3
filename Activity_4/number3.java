package Activity_4;

import java.util.Scanner;

/**
 * Program to input a number from 1 to 12 and display the equivalent month of the year.
 * Uses a switch statement to match the month number with its corresponding name.
 */
public class number3 {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a month number
        System.out.print("Enter number of month (1-12): ");
        int month = in.nextInt();

        // Display the equivalent month name using switch statement
        System.out.print("\n" + month + " is equivalent to ");
        switch(month){
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.print("Invalid month number");
        }
    }
}