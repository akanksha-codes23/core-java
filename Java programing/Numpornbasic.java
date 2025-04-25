import java .util.Scanner;
public class Numporn{
   public static void main(String[] args)
    {
     Scanner scanner =new Scanner(System.in);
     System.out.println("Enter a number");
     int number=scanner.nextInt();
     if(number>0)
     {
        System.out.println("Number is positive");

     }else{
        System.out.println("nubmer is nagative");
     }
     scanner.close();
    }
}
