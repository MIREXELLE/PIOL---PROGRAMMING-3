package Activity_3;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Inches: ");
        double inches;

        inches = input.nextDouble();

        double feet = inches/12 ;
        double centimeters = inches * 2.54;

        System.out.println("Inches to Feet: " + feet);
        System.out.println("Inches to Centimeters: " + centimeters);

    }
}
