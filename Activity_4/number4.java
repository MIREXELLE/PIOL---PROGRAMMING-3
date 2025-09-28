package Activity_4;

import java.util.Scanner;

/*
 * Program that checks the value of temperature and displays messages based on its value.
 * Temperature ranges and their corresponding remarks:
 * - Less than zero: ICE
 * - Between 0 and 100: WATER
 * - Greater than 100: STEAM
 */
public class number4 {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner temp = new Scanner(System.in);

        // Prompt user to enter temperature
        System.out.print("Enter temperature: ");
        double temperature = temp.nextDouble();

        // Determine the state of water based on temperature value
        if (temperature < 0){
            System.out.println("Remarks: Ice");
        } else if (temperature >= 0 && temperature <=  100){
            System.out.println("Remarks: Water");
        } else if (temperature > 100){
            System.out.println("Remarks Steam");
        }
        temp.close();
    }
}