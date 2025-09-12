import java.util.Scanner;
import java.util.Random;

public class Activity1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int randomNumber = random.nextInt(1000000) + 1; // Generates a random number between 1 and 1000000
        System.out.println("I'm thinking of a number between 1 and 1000000. Try to guess it.");

        while (a != randomNumber) {
            System.out.println("Enter your guess:");
            a = scanner.nextInt();

            if (a == randomNumber) {
                System.out.println("Congratulations! You guessed the right number.");
            } else if (a < randomNumber) {
                System.out.println("Too low! Try again tanga.");
            } else if (a > randomNumber) {
                System.out.println("Too high! Try again tanga.");
            }
        }
    }
}
