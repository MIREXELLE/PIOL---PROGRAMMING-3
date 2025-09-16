package Activity_2;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        double product = num1 * num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("\nProgrammer's name: Piol, Mirexelle Vincent C.");
        scanner.close();
    }
}
