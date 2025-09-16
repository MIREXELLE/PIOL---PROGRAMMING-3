package Activity_2;

public class Number5 {
    public static void main(String[] args) {
        // Given grades
        int prelim = 85;
        int midterm = 93;
        int finals = 87;
        
        // Calculate average
        double average = (prelim + midterm + finals) / 3.0;
        
        System.out.println("Prelim: " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Final: " + finals);
        System.out.printf("Average grade: %.2f\n", average);
        System.out.println("\nProgrammer's name: Piol, Mirexelle Vincent C.");
    }
}
