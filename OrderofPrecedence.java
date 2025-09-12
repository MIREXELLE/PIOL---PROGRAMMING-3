public class OrderofPrecedence {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int result = a + b * c;
        System.out.println("Result: " + result);
        for (int i = result; i < 160; i++) {
            System.out.println(i);
        }
    }
    
}
