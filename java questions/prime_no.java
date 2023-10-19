import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {

        // Prime Number: Write a Java program to check if a given number is prime or not using loops and conditional statements. 

        Scanner sc = new Scanner(System.in);
        System.out.print("plz  enter any number :");

        int a = sc.nextInt();

        for(int i=0; i<=a; i++)
        {
            if( a%a==1 || a%1==a ) 
            {
                System.out.println(" no is prime ");

            }
            else{
                System.out.println(" no is not prime ");
            }

        }




        sc.close();

    }
    
}
