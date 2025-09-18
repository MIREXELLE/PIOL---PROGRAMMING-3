package Activity_3;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Eggs per basket: ");
        int eggs = input.nextInt();
        System.out.println("Enter number of basket: ");
        int basket = input.nextInt();

        int totalEggs = basket * eggs;
        int takeawayEggs = 2;
        //take 2 eggs to each basket
        takeawayEggs = eggs - takeawayEggs;
        int newTotal = basket  * takeawayEggs;

        System.out.println("if you have " + eggs + " eggs per basket and \n" + basket + " baskets, then\nthe total number of eggs is " + totalEggs);
        System.out.println("Now we take two eggs out of each basket.");
        System.out.println("Now you have \n"+ takeawayEggs + " eggs per basket and \n" + basket + " baskets, then the total number of eggs is " + newTotal);
        System.out.println("\nThank you!");
    }
}
