
import java.util.Scanner;
 public class even_odd {

    //   Even or Odd: Write a Java program that prints all even and odd numbers in the given range

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Even or Odd: Write a Java program that prints all even and odd numbers in the given range

        System.out.println("enter any number");
      
         int a= sc.nextInt();
         for(int i=0; i<=a;i++)
         {
            if(i%2==0)
            {
                System.out.println(" number is even:" +i);
            }
            // else{
            //     System.out.println(" number is odd :");
            // }
         }
        

         System.out.println("enter any number");
      
         int b= sc.nextInt();
         for(int i=0; i<=b;i++)
         {
            if(i%2 !=0)
            {
                System.out.println(" number is odd:" +i);
            }
            // else{
            //     System.out.println(" number is odd :");
            // }
         }

         
        sc.close();
        




        
    }
    
    
}
    

