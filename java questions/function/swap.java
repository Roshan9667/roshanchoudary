import java.util.Scanner;

public class swap {

    public static void swaping(int a, int b){
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("first no "+a);
     System.out.println("second no : "+b);
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first no : ");
      int a=sc.nextInt();
      System.out.println("enter second number : ");
      int b=sc.nextInt();
      swaping(a,b);  
    }
}
