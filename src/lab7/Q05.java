package lab7;

import java.util.Scanner;

public class Q05 {
    public static int findSecondLargest(int[] arr) {
        int max=arr[0];
        int max2=arr[1];
        for (int n : arr) {
            if (n>=max) {
                max2 = max;
                max = n;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Largert number is "+ findSecondLargest(arr));
        sc.close();
    }
}
