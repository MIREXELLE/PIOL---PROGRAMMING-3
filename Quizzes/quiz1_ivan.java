package Quizzes;
import java.util.Scanner;
public class quiz1_ivan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NO. OF BAGS SOLD: ");
        int numberOfBags = scanner.nextInt();

        System.out.print("WEIGHT PER BAG(POUNDS): ");
        double unitWeight = scanner.nextDouble();

        double costPerPound = 5.99;
        double salesTaxRate = 0.0725;

        double totalPrice = unitWeight * numberOfBags * costPerPound;

        double totalPriceWithTax = totalPrice + (totalPrice * salesTaxRate);

        System.out.println("PRICE PER POUND: " + costPerPound);
        System.out.printf("SALES TAX: %.02f%%\n", (salesTaxRate * 100));
        System.out.printf("TOTAL PRICE WITH TAX: %.3f\n", totalPriceWithTax);
        System.out.println("Programming name: Toledo, Ivan P");
        scanner.close();
    }
}
