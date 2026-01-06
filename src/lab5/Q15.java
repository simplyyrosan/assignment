package lab5;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (n > 3): ");
        int n = sc.nextInt() - 3;
        int a = 0, b = 1, c= 1, temp;
        System.out.print("0 1 1 ");
        for (int i = 0; i<n; i++) {
            temp = c;
            c = a+b+c;
            a = b;
            b = temp;
            System.out.print(c + " ");
        }
    }
}

