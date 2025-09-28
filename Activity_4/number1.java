package Activity_4;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a value (customize as needed)
        System.out.print("Enter value: ");
        String input = in.next();

        // Output a message based on the input using if-else statements
        System.out.println("Message: ");
        if (input.equals("X")) {
            System.out.println("SOME MESSAGE");
        } else if (input.equals("Y")) {
            System.out.println("ANOTHER MESSAGE");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}