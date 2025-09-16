package Activity_2;

public class Number7 {
    public static void main(String[] args) {
        double distance = 5400; // miles
        double speed = 220; // mph
        
        // Calculate time = distance / speed
        double time = distance / speed;
        
        // Convert to hours and minutes
        int hours = (int)time;
        int minutes = (int)((time - hours) * 60);
        
        System.out.println("Distance: " + distance + " miles");
        System.out.println("Speed: " + speed + " mph");
        System.out.println("Time required: " + hours + " hours and " + minutes + " minutes");
        System.out.println("\nProgrammer's name: Piol, Mirexelle Vincent C.");
    }
}
