package lab7;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 integer: ");
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i=0; i<9; i++) {
            for (int j=0; j<9-i; j++) {
                if (arr[j+1]==0) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int x : arr) System.out.print(x + " ");
        sc.close();
    }
}
