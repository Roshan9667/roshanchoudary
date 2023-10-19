import java.util.Scanner;

public class leapyear {
    public static void leap(int year){
        if(year%400==0){
            System.out.println("year is leap");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("year is leap");
        }
        else{
            System.out.println("year is not leap");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year :");
        int year=sc.nextInt();
        leap(year);
        sc.close();
    }
}
