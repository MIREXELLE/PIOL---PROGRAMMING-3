package Activity_2;

import java.util.Scanner;

public class Number8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        System.out.println("Rectangle dimensions: " + length + " x " + width);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.println("\nProgrammer's name: Piol, Mirexelle Vincent C.");
        
        scanner.close();
    }
}
