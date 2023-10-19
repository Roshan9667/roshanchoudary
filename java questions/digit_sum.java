import java.util.Scanner;
  public class digit_sum {

    // Digit Sum.You are given an integer number, say 123 the output will be 1+2+3=6.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any number: ");

        int  n = sc.nextInt();
        
        int  sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum = sum+rem;
            n=n/10;
            System.out.print(" no is : " +n);
    

        sc.close();
        }
       


    }
    
}
