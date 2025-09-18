package Activity_3;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Inches: ");
        double inches;

        inches = input.nextDouble();

        double feet = inches / 12 ; // 1 inch is 0.0833333 feet
        double centimeters = inches * 2.54; // 1 inch is 2.54 cm

        System.out.println("Inches to Feet: " + feet);
        System.out.println("Inches to Centimeters: " + centimeters);

    }
}
