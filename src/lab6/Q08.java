package lab6;

import java.util.Scanner;

public class Q08 {
    public static int largestDigit(int n) {
        int max = 0;
        while (n>0) {
            if (n%10 > max) max = n%10;
            n = n/10;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        System.out.println("Largest digit: "+largestDigit(num));
        sc.close();
    }
}
