import java.util.Scanner;

public class Plus {
    public static void myname( int age){
        System.out.println("my age is :  "+age);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println(" enter  age ");
       int age=sc.nextInt();
       myname(age);
    }
}
