package Activity_4;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter number: ");
        int num1 = in.nextInt();

        if (num1 <= -1) {
            System.out.println(num1 + " is a negative number");
        } else if (num1 >= 0) {
            System.out.println(num1 + " is a positive number");
        } else {
            System.out.println("Invalid number");
        }

    }
}