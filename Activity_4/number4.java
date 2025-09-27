package Activity_4;

import java.util.Scanner;

public class number4 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = temp.nextDouble();

        if (temperature < 0){
            System.out.println("Remarks: Ice");
        } else if (temperature >= 0 && temperature <=  100){
            System.out.println("Remarks: Water");
        } else if (temperature > 100){
            System.out.println("Remarks Steam");
        }
    }
}
