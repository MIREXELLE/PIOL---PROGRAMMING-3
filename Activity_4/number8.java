package Activity_4;

import java.util.Scanner;

public class number8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many person would you like to register for the seminar?: ");
        int registrants = in.nextInt();

        if (registrants >= 1 && registrants <= 4){
            registrants *= 500;
            System.out.print("Fee per person: ₱500 \n");
            System.out.println("Total amount owed by the company is: ₱" + registrants);

        } else if (registrants >= 5 && registrants <= 10){
            registrants *= 400;
            System.out.print("Fee per person: ₱400 \n");
            System.out.println("Total amount owed by the company is: ₱" + registrants);

        } else if (registrants >= 11){
            registrants *= 300;
            System.out.print("Fee per person: ₱300 \n");
            System.out.println("Total amount owed by the company is: ₱" + registrants);

        } else {
            System.out.println("Number of person cannot be negative or zero.");
        }
    }
}
