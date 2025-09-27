package Activity_4;

import java.util.Scanner;

public class number5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your gender? \nf or m?: ");
        String gender = in.next();

        if (gender.equals("m")){
            System.out.println("HELLO SIR");
        }
        else if(gender.equals("f")){
            System.out.println("HELLO MADAM");
        } else {
            System.out.println("f or m only.");
        }
    }
}
