package Activity_2;

public class Number10 {
    public static void main(String[] args) {
        double principal = 250000.00; // PHP
        double ratePerYear = 0.12; // 12%
        int time = 30; // days
        double withholdingTaxRate = 0.10; // 10%
        
        // Calculate interest using I = PRT formula
        double interest = principal * ratePerYear * (time / 365.0);
        
        // Calculate withholding tax
        double withholdingTax = interest * withholdingTaxRate;
        
        // Calculate net interest
        double netInterest = interest - withholdingTax;
        
        System.out.println("Principal amount: ₱" + principal);
        System.out.println("Interest rate: " + (ratePerYear * 100) + "%");
        System.out.println("Term: " + time + " days");
        System.out.printf("Gross interest: ₱%.2f\n", interest);
        System.out.printf("Withholding tax (10%%): ₱%.2f\n", withholdingTax);
        System.out.printf("Net interest: ₱%.2f\n", netInterest);
    }
}
