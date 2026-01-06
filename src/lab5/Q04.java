package lab5;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int num = 0;
        int div = 0;
        for (int i=n1; i<n2; i++) {
            int count = 0;
            for (int j=1; j<i+1; j++) {
                if (i%j==0)
                    count+=1;
            }
            if (count>=div) {
                div = count; 
                num = i;
            }
        }

        System.out.println("The number with the most divisor is "+ num);
        System.out.println("Number of divisors: " + div);
        sc.close();
    }
}
