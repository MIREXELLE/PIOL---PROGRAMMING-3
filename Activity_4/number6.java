package Activity_4;

import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to know if it's odd or even: ");
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is a EVEN number");
        } else {
            System.out.println(num + " is a ODD number");
        }

    }
}
