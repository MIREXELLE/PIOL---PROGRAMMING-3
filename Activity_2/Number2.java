package Activity_2;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius;
        double sphere;
        double pi = 3.14;

        System.out.print("Enter the radius: ");
        radius = scan.nextDouble();
        sphere = 4.0/3.0 * pi * (radius * radius * radius); // or use Math for the pi and radius but since it's not covered in this topic, I will do it manually.
        System.out.printf("The area of the circle is %.2f", sphere);
        System.out.println("\nProgrammer's name: Piol, Mirexelle Vincent C.");


    }
}