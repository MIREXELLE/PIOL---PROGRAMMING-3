package Activity_4;

import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();

        if (num1 %5 == 0){
            System.out.println(num1 + " is divisible by 5");
        } else {
            System.out.println(num1 + " is not divisible by 5");
        }
    }
}
