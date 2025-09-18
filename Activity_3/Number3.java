package Activity_3;

import java.util.Scanner;
public class Number3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 whole numbers: ");
        int num1 , num2 ;
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("You entered: " + num1 + " and " +  num2);

        System.out.print("Enter 2 Numbers: ");
        double dec1, dec2;
        dec1 = input.nextDouble();
        dec2 = input.nextDouble();
        System.out.println("You entered: " + dec1 + " and " +  dec2);

        System.out.print("Enter 2 words: ");
        String word1, word2;
        word1 = input.next();
        word2 = input.next();
        System.out.println("You entered: " + word1 + " and " +  word2);

        System.out.print("Enter a line of text: ");
        input.nextLine();
        String sentence;
        sentence = input.nextLine();
        System.out.println("You entered: " + sentence);
    }
}
