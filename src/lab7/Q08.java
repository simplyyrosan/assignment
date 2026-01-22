package lab7;

import java.util.Arrays;

public class Q08 {
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        return (count==2);
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            arr[i] = (int) (Math.random()*(29)) + 3;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr);
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
