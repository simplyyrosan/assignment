package lab5;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); int temp = num;
        int sum = 0;
        while (temp>0) {
            int d = temp%10;
            int fac = 1;
            for (int i=1; i<d+1; i++) {
                fac*=i;
            }
            sum+=fac;
            temp /= 10;
        }

        if (sum==num)
            System.out.println(num + "is a strong number");
        else
            System.out.println(num + "is not a strong number");
        sc.close();
    }
}
