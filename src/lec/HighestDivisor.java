package lec;

import java.util.Scanner;

public class HighestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        int max = 0;
        int maxn = 0;
        for (int i = n1; i<=n2; i++) {
            int div = 0;
            for (int j = 1; j<=i; j++) {
                if (i%j==0) 
                    div++;
            }
            if (div>max) {
                max = div;
                maxn = i;
            }
        }
        System.out.println(maxn + " has maximum number of divisor: " + max);
        sc.close();
    }
}
