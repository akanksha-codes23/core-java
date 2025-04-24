

public class Incredre4 {
  
    public static void main(String args[]){
        int x = 2;
        x = x++ + x++;       // First step
        System.out.println(x); // Output: 5
        
        x = ++x + ++x;       // Second step
        System.out.println(x); // Output: 13
    }  
}
