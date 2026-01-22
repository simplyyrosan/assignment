package lab6;

import java.util.Scanner;

public class Q05 {

    public static int collatzLength(int n) {
        int count = 0;
        while (n>1) {
            if (n%2==0) n=n/2;
            else n = 3*n+1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        System.out.println("Collatz length: "+ collatzLength(num));
        sc.close();
    }
}
