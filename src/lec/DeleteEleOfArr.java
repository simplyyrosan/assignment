package lec;

import java.util.Arrays;

public class DeleteEleOfArr {
    public static void delete(int[] arr, int ele) {
        int p = 0;
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            if (arr[i] == ele) {
                arr[p] = arr[i];
            } else 
            arr[p++] = arr[i];
        }
        if (p<n) {
            arr[n-1] = 0;
        } else System.out.println("Element not found");

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 4, 3};

        delete(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
