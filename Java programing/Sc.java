import java.util.*;
public class Sc {
   

    
    
        static int num2; // static variable
        int num1;        // instance variable
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
          
            System.out.print("Enter local variable num1: ");
            int num1 = scanner.nextInt();
            System.out.println(num1);
    
          
            System.out.print("Enter static variable num2: ");
            num2 = scanner.nextInt();
            System.out.println(num2);
    
            // Input for instance variable
            Sc main = new Sc();
            System.out.print("Enter instance variable num1: ");
            main.num1 = scanner.nextInt();
            System.out.println(main.num1);
        scanner.close();
    }
     
}
