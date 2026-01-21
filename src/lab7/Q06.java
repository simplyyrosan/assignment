package lab7;

import java.util.Scanner;

public class Q06 {
    private static final Scanner sc = new Scanner(System.in);


    public static void readArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            sc.nextInt();
        }
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x>max) max=x;
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x<min) min = x;
        }
        return min;
    }

    public static int countOccurrences(int[] arr, int value) {
        int count = 0;
        for (int x : arr) {
            if (value==x) count++;
        }
        return count;
    }

    public static int firstPositionOfMax(int[] arr, int max) {
        int pos = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==max) {
                pos = i;
            }
        }
        return pos;
    }

        public static int firstPositionOfMin(int[] arr, int min) {
        int pos = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==min) {
                pos = i;
            }
        }
        return pos;
    }

}
