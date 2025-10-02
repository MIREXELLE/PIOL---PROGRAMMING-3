package Quizzes;
import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF BAGS SOLD: ");
        int numberOfBags = in.nextInt();

        System.out.print("ENTER WEIGHT PER BAG(POUNDS): ");
        double unitWeight = in.nextDouble();


        double salesTax = 0.0725;
        double pricePerPound = 5.99;
        double totalPrice = unitWeight * numberOfBags * pricePerPound ;
        double totalPriceWithTax = totalPrice + (totalPrice * salesTax);

        System.out.println("\nNO. OF BAGS SOLD: " + numberOfBags);
        System.out.println("WEIGHT PER BAG(POUNDS): " + unitWeight);
        System.out.printf("PRICE PER POUND: %.2f\n", pricePerPound);
        System.out.printf("SALES TAX: %.2f%%\n", (salesTax * 100) );
        System.out.printf("TOTAL PRICE WITH TAX: %.3f", totalPriceWithTax);
        System.out.println("\nProgramming name: Piol, Mirexelle Vincent C");
        in.close();
    }
}
