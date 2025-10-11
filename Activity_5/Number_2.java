package Activity_5;
// 2. Write a program to calculate the sum of first 10 natural number.
public class Number_2 {
    public static void main(String[] args) {
        // Declare and initialize sum variable to 0
        int sum = 0;

        // Loop from 1 to 10 to add each number to sum
        for (int i = 1; i <= 10; i++) {
            // Add the current value of i to the running total sum
            sum += i;
        }

        // Display the final sum to the user
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}