package Activity_4;

import java.util.Scanner;

/**
 * 8. Create a program that displays the total amount of money a company owes for a
 * seminar. The seminar per person is based on the number of people the company
 * registers. For example, if the company registers seven people, then the total amount
 * owed by the company is P2800. If the user enters the number 0 or a negative number,
 * the program should display an appropriate error message.
 * Number of registrants    Fee per person
 * 1 – 4                    P500
 * 5 – 10                   P400
 * 11 or more               P300
 */
public class number8 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter number of registrants
        System.out.print("How many person would you like to register for the seminar?: ");
        int registrants = in.nextInt();

        // Calculate total fee based on number of registrants
        if (registrants >= 1 && registrants <= 4){
            // Fee is ₱500 per person for 1-4 registrants
            registrants *= 500;
            System.out.print("Fee per person: ₱500 \n");
            System.out.println("Total amount owed by the company is: ₱" + registrants);

        } else if (registrants >= 5 && registrants <= 10){
            // Fee is ₱400 per person for 5-10 registrants
            registrants *= 400;
            System.out.print("Fee per person: ₱400 \n");
            System.out.println("Total amount owed by the company is: ₱" + registrants);

        } else if (registrants >= 11){
            // Fee is ₱300 per person for 11+ registrants
            registrants *= 300;
            System.out.print("Fee per person: ₱300 \n");
            System.out.println("Total amount owed by the company is: ₱" + registrants);

        } else {
            // Display error for invalid input (0 or negative)
            System.out.println("Number of person cannot be negative or zero.");
        }
    }
}