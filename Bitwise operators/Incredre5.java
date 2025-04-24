

public class Incredre5 {
    public static void main(String[] args) {
        // First expression: using post-increment and pre-increment
        int x = 5;
        int y = x++ * ++x;  // x++ = 5 (then x becomes 6), ++x = 7 -> y = 5 * 7 = 35
        System.out.println("After x++ * ++x:");
        System.out.println("x = " + x); // x = 7
        System.out.println("y = " + y); // y = 35

        // Second expression: using two pre-increments
        x = 5; // Reset x back to 5
        y = ++x * ++x;  // ++x = 6, then ++x = 7 -> y = 6 * 7 = 42
        System.out.println("\nAfter ++x * ++x:");
        System.out.println("x = " + x); // x = 7
        System.out.println("y = " + y); // y = 42
    }
}
