package Activity_4;

import java.util.Scanner;

public class number10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a letter grade
        System.out.print("Enter letter grade: ");
        String grade = in.next();

        // Output the corresponding message based on the grade using if-else statements
        System.out.println("Message: ");
        if (grade.equals("A")){
            System.out.println("EXCELLENT");
        } else if (grade.equals("B")){
            System.out.println("ABOVE AVERAGE");
        } else if (grade.equals("C")){
            System.out.println("AVERAGE");
        } else if (grade.equals("D")){
            System.out.println("BELOW AVERAGE");
        } else if (grade.equals("F")){
            System.out.println("FAILED");
        } else {
            System.out.println("INVALID GRADE");
        }

        /*
         * The following switch statement is a suggestion only.
         * It uses Java's enhanced switch syntax
         * to make the code more concise and readable compared to multiple if-else statements.
         * You can use this instead of the if-else block above for better maintainability.
         *
         * switch (grade) {
         *     case "A" -> System.out.println("EXCELLENT");
         *     case "B" -> System.out.println("ABOVE AVERAGE");
         *     case "C" -> System.out.println("AVERAGE");
         *     case "D" -> System.out.println("BELOW AVERAGE");
         *     case "F" -> System.out.println("FAILED");
         *     default -> System.out.println("INVALID GRADE");
         * }
         */
    }
}