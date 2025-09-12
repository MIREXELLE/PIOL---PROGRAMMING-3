package Activity_2;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount in dollars: $");
        double dollars = scanner.nextDouble();
        
        // Convert dollar to peso (1 dollar = 50.75 pesos)
        double pesos = dollars * 50.75;
        
        System.out.printf("$%.2f is equivalent to ₱%.2f\n", dollars, pesos);
        
        scanner.close();
    }
}
