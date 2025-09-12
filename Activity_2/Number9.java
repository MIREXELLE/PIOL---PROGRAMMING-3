package Activity_2;

import java.util.Scanner;

public class Number9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length in feet: ");
        double feet = scanner.nextDouble();
        
        // Convert to inches (1 foot = 12 inches)
        double inches = feet * 12;
        
        System.out.printf("%.2f feet = %.2f inches\n", feet, inches);
        
        scanner.close();
    }
}
