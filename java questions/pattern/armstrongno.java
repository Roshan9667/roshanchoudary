import java.util.Scanner;

public class armstrongno {
    public static void armstrong(int num ){
     int result=0;
     int n=num;
     while(n!=0){
        int rem=n%10;
        result=result+(rem*rem*rem);
        n=n/10;

     }
     if(result==num){
        System.out.println("it is a armstrong number ");
     }
     else{
        System.out.println("it is not an armstrong number ");
     }

    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number : ");
      int num=sc.nextInt();
      armstrong(num);
      sc.close();

    }
}
