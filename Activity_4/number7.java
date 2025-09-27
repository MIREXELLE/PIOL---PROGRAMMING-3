package Activity_4;
import java.util.Scanner;

/*Write a program that will ask the user to input the age. If the age is less than 18 then
display the message “YOU ARE NOT QUALIFIED TO VOTE”. If the age is 19 and
above then display the message “YOU ARE QUALIFIED TO VOTE”.*/

public class number7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age < 18){
            System.out.println("YOU ARE NOT QUALIFIED TO VOTE");
        } else if (age > 18) {
            System.out.println("YOU ARE QUALIFIED TO VOTE");
        }

    }

}
