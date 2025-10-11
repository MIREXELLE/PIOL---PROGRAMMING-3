package Activity_5;
// 8. Write a program to print following :
public class Number_8 {
    public static void main(String[] args) {
        // Pattern (i): Print 4 rows, each with 10 asterisks
        System.out.println("Pattern (i):");
        // Outer loop for rows
        for (int i = 0; i < 4; i++) {
            // Inner loop for columns (10 asterisks per row)
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            // Newline after each row
            System.out.println();
        }
        // Add extra newline between patterns
        System.out.println();

        // Pattern (ii): Print a triangle, increasing asterisks per row
        System.out.println("Pattern (ii):");
        // Outer loop for rows (1 to 5)
        for (int i = 1; i <= 5; i++) {
            // Inner loop for asterisks in each row (increases with i)
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Newline after each row
            System.out.println();
        }
    }
}