package lab7;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        System.out.println("Enter integer between 1 to 100: ");
        for (int i=0; ;i++) {
            int n = sc.nextInt();
            if (n==0) break;
            arr[i] = n;
        }

        for (int x : arr) System.out.print(x + " ");

    }   
}
