package Activity_4;
import java.util.Scanner;

/**
 * Write a program that will ask the user to input the age. If the age is less than 18 then
 * display the message "YOU ARE NOT QUALIFIED TO VOTE". If the age is 19 and
 * above then display the message "YOU ARE QUALIFIED TO VOTE".
 */
public class number7 {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter age
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // Check if age qualifies for voting
        if (age < 18){
            System.out.println("YOU ARE NOT QUALIFIED TO VOTE");
        } else if (age > 18) {
            System.out.println("YOU ARE QUALIFIED TO VOTE");
        }
        // Note: The logic doesn't handle the case where age == 18, should be included in either condition
    }
}