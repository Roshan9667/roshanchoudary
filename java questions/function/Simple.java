import java.util.Scanner;

public class Simple {
    public static int simpleinterest(int rate ,int amount,int principle){
       int result=(rate*amount*principle)/100;
       System.out.println("simple interest is : "+result);
       return 0;
    
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle amount : ");
        int principle=sc.nextInt();
        System.out.println("enter intrest rate : ");
        int rate=sc.nextInt();
        System.out.println("enter time : ");
        int time=sc.nextInt();
        simpleinterest(principle,rate,time);

    }
}
