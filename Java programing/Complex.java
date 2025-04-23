import java.util.Scanner;

public class Complex {
    public static void main(String []args)
    {
        Scanner input= new Scanner(System.in);
        //apni age dalo
        System.out.println("Apni age dalo");
        int age=input.nextInt();

        System.out.println("Apna gender  dalo (male/female):");
        String gender =input.next().toLowerCase();//lower case me convert kiya

        System.out.println("Apni education level dalo (graduated/non-graduated):");
        String education =input.next().toLowerCase();

        if(age>=18)
        {
          if(gender.equals("male"))   
          {
            if(education.equals("graduated"))
            {
                System.out.println("Adult  male -graduated");
            }
            else{
                System.out.println("Adult  male -Non graduated");
            }
          }else if (gender.equals("female"))
          {
            if(education.equals("graduated"))
            {
                System.out.println("Adult  female -graduated"); 
            }
            else{
                System.out.println("Adult  female -Non graduated");
            }
          }
        }
        else{
            //agar age 18 se kam se ho
            if(gender.equals("male"))
            {
                System.out.println("Teenage male");
            }else if(gender.equals("female")){
                System.out.println("Teenage female");
            }
            else{
                System.out.println("Gender sahi se dalo male ya female");
            }
        }
    }
}
