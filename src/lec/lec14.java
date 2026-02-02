package lec;

import java.util.Arrays;

public class lec14 {
    public static int[] longestOrder(int[] arr) {
        int n = arr.length;
        int[] big = new int[n];
        int[] cur = new int[n];
        int pos=0;
        int b = 0;
        boolean isSeries=false;
        for (int i=0; i<n-1; i++) {
            if (arr[i]<arr[i+1]) {
                isSeries = true;
                cur[pos++] = arr[i];
                if (i==n-2) cur[pos++] = arr[i+1];
            } else {
                if (isSeries) cur[pos++] = arr[i];
                isSeries = false;
                if (pos>b) {
                    b = pos;
                    big = cur;
                }
                pos = 0;
                cur = new int[n];
            }
            if (pos>b) {
                b = pos;
                big = cur;
            }
        }

        int[] res = new int[b];
        for (int i = 0; i<b; i++) res[i] = big[i];
        return res;
    }    

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 2, 4, 5, 6, 1, 4, 5, 6, 7, 8, 9};
        arr = longestOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}
