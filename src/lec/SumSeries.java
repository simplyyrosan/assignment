package lec;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumf = 0;
        for (int i=1; i<=n; i++) {
            int sum = 0;
            for (int j=1; j<=i; j++) {
                sum+=j;
                
            }
            sumf+=sum;
        }
        System.out.println("Sum of series is " + sumf);
        sc.close();
    }
}
