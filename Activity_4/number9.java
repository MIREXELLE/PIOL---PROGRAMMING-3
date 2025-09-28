package Activity_4;

/*
9. Switch Statement program: Displaying a price. A program needs to display a price
   based on a product ID entered by the user. The valid product ID and their prices are
   shown below:
   Product ID          Price
   1                   50.55
   2                   12.35
   5                   11.46
   7                   11.46
   9                   12.35
   11                  11.46
*/

import java.util.Scanner;

public class number9 {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a product ID
        System.out.print("Enter Product ID: ");
        int id = in.nextInt();
        double price = 0;

        // Use switch statement to set price based on product ID
        switch (id) {
            case 1:
                price = 50.55;
                break;
            case 2, 9: //id 2 and 9 have the same price, so I merged it together instead
                price = 12.35;
                break;
            case 5, 7, 11: // 5, 7, 11 have the same values, same as ID 2 and 9.  in this way the code is shorter and cleaner.
                price = 11.46;
                break;
            default:
                price = 0.00;
                System.out.println("INVALID PRODUCT ID");
                break;
        }

        // Display the product price
        System.out.println("Product Price: ₱" + price);

        // Close the scanner
        in.close();
    }
}
/* We can use enhanced switch to further shorten the code.
 *
 *        System.out.print("Enter Product ID: ");
 *        int id = in.nextInt();
 *        double price = switch (id) {
 *            case 1 -> 50.55;
 *            case 2, 9 -> 12.35;
 *            case 5, 7, 11 -> 11.46;
 *            default -> 0;
 *        };
 */