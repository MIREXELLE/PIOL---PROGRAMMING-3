package Activity_2;

public class Number3 {
    public static void main(String[] args) {
        String name = "Juan Dela Cruz";
        int hoursWorked = 40;
        double hourlyRate = 215.75;
        
        double grossPay = hoursWorked * hourlyRate;
        
        System.out.println("Worker: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly rate: ₱" + hourlyRate);
        System.out.printf("Gross pay: ₱%.2f\n", grossPay);
        System.out.println("\nProgrammer's name: Piol, Mirexelle Vincent C.");
    }
}
