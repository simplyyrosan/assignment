package lab5;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();       

        if (m>n || m<0 || n<0) {
            System.out.println("Invalid input, condition of input m < n, m > 0, n > 0");
            System.exit(0);
        }
        for (int i = m; i<=n; i++) {
            int fac=1;
            for (int j = 1; j<=i; j++ ) {
                fac*=j;
            }
            System.out.println("Factorial of "+i+" is: "+fac);
        }

        sc.close();
    }
}
