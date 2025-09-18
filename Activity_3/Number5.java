package Activity_3;

import java.util.Scanner;
public class Number5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double hourlyRate = 15.50;
        System.out.print("Please enter your hourly pay rate: $");
        hourlyRate = in.nextDouble();

        double workHours;
        System.out.print( "Please enter the number of hours you worked each week: ");
        workHours = in.nextDouble();

        double weeks = 5;
        double totalHours = weeks * workHours;

        //Income breakdown
        double taxes = 0.14;
        double totalIncome = totalHours * hourlyRate;
        double afterTaxesIncome = totalIncome - (totalIncome * taxes);

        //Spending
        double clothesAndAcc = afterTaxesIncome * 0.10;
        double schoolSupp = afterTaxesIncome * 0.01;
        double remainingMoney = afterTaxesIncome - (schoolSupp + clothesAndAcc);

        //saving bonds
        double savinBonds = remainingMoney * 0.25;
        double partnerContributions = savinBonds * 0.50;

        System.out.println("Income before taxes from my summer job: $" + totalIncome);
        System.out.println("Income after taxes from my summer job: $" + afterTaxesIncome);
        System.out.println("Money I spent on clothes and other accessories: $" + clothesAndAcc);
        System.out.println("Money I spent on school supplies: $" + schoolSupp);
        System.out.println("Money I spent to buy savings bonds:  $" + savinBonds);
        System.out.println("Money parents spent to buy additional savings bonds for me: $" + partnerContributions);
    }
}


