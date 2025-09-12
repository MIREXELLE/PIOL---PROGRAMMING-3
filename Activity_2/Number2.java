package Activity_2;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        
        // Calculate volume using formula V = 4/3 * π * r^3
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        
        System.out.printf("The volume of the sphere with radius %.2f is %.2f cubic units\n", 
                          radius, volume);
        
        scanner.close();
    }
}
