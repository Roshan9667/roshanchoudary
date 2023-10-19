import java.util.Scanner;

public class primenumber {
    public static void primeno(int num) {
        int a = num;
        int check = 1;
        for (int i = 2; i < a; i++) {
            if (num % i == 0) {
                check = 0;
            }
        }
        if (check == 1) {
            System.out.println("number is prime ");
        } else {
            System.out.println("number is not prime");
        }
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();
        primeno(num);
        sc.close();

    }
}
