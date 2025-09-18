package Activity_3;

import java.util.Scanner;
public class Number4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double litersMilk;
        System.out.print("Enter the total amount of milk produce in the morning: ");
        litersMilk = input.nextDouble();

        double milkCarton = 3.78;
        double cost = 0.38;
        double profit = 0.27;
        double totalMilkCarton = litersMilk / milkCarton;
        double totalCost = litersMilk * cost;
        double totalProfit = litersMilk * profit;

        System.out.printf("Number of milk cartons needed to hold milk: %.2f Cartons\n", totalMilkCarton );
        System.out.printf("Cost of producing milk: $%.2f\n", totalCost);
        System.out.printf("Profit for producing milk: $%.2f\n", totalProfit);
    }
}
