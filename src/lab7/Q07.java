package lab7;

import java.util.Arrays;

public class Q07 {
    public static void rotateClockwise(int[] arr) {
        int n = arr.length;
        int last = arr[n-1];
        for (int i = n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateClockwise(arr);
        System.out.println(Arrays.toString(arr));
    }

}
