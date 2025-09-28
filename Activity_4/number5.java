package Activity_4;

import java.util.Scanner;

/*
 * 5. Write a program that will ask the user to input a character "m" or "f" and then it will
 * display "HELLO SIR", if the input is "m", otherwise "HELLO MADAM"
 */
public class number5 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter their gender
        System.out.print("What is your gender? \nf or m?: ");
        String gender = in.next();

        // Display appropriate greeting based on gender input
        if (gender.equals("m")){
            System.out.println("HELLO SIR");
        }
        else if(gender.equals("f")){
            System.out.println("HELLO MADAM");
        } else {
            System.out.println("f or m only.");
        }
        in.close();
    }
}